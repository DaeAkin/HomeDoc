package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.MemberService;
import com.www.homedoc.service.ReplyService;


// 
// 게시판 누르시 댓글 가져오는 테스트와 
// 댓글 작성시 alert가 제대로 되는지 테스트의 통합테스트  

/*
 * 테스트 내용 
 * 멤버를 두개 생성 , 맴버1 멤버2 
 * 멤버1이 글을 작성 , 
 * 멤버1 멤버2 가 그 글에 댓글을 달음. 
 * 자신이 단 댓글은 알림이 오지 않고 
 * 멤버2가 단 댓글만 알림이 오도록
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class BoardAndReplyTest {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	ReplyService replyService;
	
	@Autowired
	MemberService memberService;
	
	MemberDto memberDto;
	MemberDto memberDto2;
		
	BoardDto boardDto;
	
	ReplyDto replyDto;
	ReplyDto replyDto2;
	
	Calendar cal = Calendar.getInstance();
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	String dateInString = "2019-04-22 10:22:11";
	
	
	
	
	@Before
	public void setUp() {
		
	}
	@Test
	public void getReplyWithBoard_NoAndAlertTest() throws ParseException {
		Date date = format.parse(dateInString);
		
		
		//DB 전부삭제. 
		boardService.deleteAll();
		memberService.deleteAll();
		replyService.deleteAll();
		

		// 멤버1 주입 / 이 멤버가 글을 작성할 것임.
		memberDto = new MemberDto("testid", "1234",
				"test@email", "인덕", "");
		
		memberDto2 = new MemberDto("hihiid2", "1234",
				"hihi@email", "인덕", "");
		
		memberService.insert(memberDto);
		memberService.insert(memberDto2);
		
		
		//멤버 한개 넣어주기. DB에서 생성해준 no의 값이 필요하다.  
		// 지금 들어간 memberDto의 no를 모르니 전부 가져오자.
		List<MemberDto> memberDtos = 
				memberService.selectAll();
		
		memberDto.setNo(memberDtos.get(0).getNo());
		
		memberDto2.setNo(memberDtos.get(1).getNo());
		
		// memberDto가 글을 작성하기
		boardDto = new BoardDto("title", memberDto.getId(),
			 0, "1", "테스트","sdasd.jpg");
		
		boardService.insert(boardDto);
		
		// board의 no 가져오기
		List<BoardDto> boardDtos =
				boardService.selectAll();
		
		boardDto.setNo(boardDtos.get(0).getNo());

		// 댓글 작성하기 
		replyDto = new ReplyDto(boardDto.getNo(), 
				"견적서 입니다", memberDto2.getId(), false,"testid");
		replyDto = new ReplyDto(boardDto.getNo(), 
				"나중에 알려드릴께요", memberDto2.getId(), false,"testid");
		
		replyDto2 = new ReplyDto(boardDto.getNo(), 
				"감사합니다.", memberDto.getId(), false,"testid");
		
		replyService.insert(replyDto);
		replyService.insert(replyDto2);
		
		// 해당 board_no로 댓글이 잘 들어 갔는지 확인 
		assertThat(replyService.getAllReplyWithboard_no(replyDto.getBoard_no()).size(), is(2));
		
		
		// 알람테스트 시작
		
		List<AlertDto> alertDtos = 
				memberService.getAlert(memberDto.getId());
		System.out.println("--- 알람 ----");
		
//		for(int i=0; i<alertDtos.size(); i++) {
//			System.out.println(alertDtos.get(i).getTitle() + "에 댓글이 달렸습니다.");
//			System.out.println(alertDtos.get(i).getContent());
//			System.out.println(alertDtos.get(i).getDatatime()+ "전");
//		}
		
		assertThat(alertDtos.size(), is(1));
		
		// 읽음 표시
		replyService.changeIsAlertToTrue(alertDtos.get(0).getReply_no());
		
		//다시 DB에서 가져오기 
		 alertDtos =
					memberService.getAlert(memberDto.getId());
		 
		// 읽음처리 됐는지 확인. 
		 assertThat(alertDtos.get(0).getIsalert(), is(true));
		 
		 System.out.println("alertDtos : " + alertDtos.toString());
		 

	}

}
