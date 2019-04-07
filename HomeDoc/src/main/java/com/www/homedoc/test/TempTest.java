package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.commons.codec.Decoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class TempTest {
	
	@Test
	public void sHATest() throws DecoderException {
		
		 String testString = "1q2w3e4r";
		 
		 String pw = "1q2w3e4r";
		 
		 System.out.println("testString : " + testString);
		 
		 System.out.println("pw : " + pw);
		 
		 String encodedString = 
				 DigestUtils.sha256Hex(testString);
		 String encodedPw =
				 DigestUtils.sha256Hex(pw);
		 
		 
		 System.out.println("sha256Hex : "  + encodedString);
		 System.out.println("pw : " + encodedPw);
		 
		 Hex hex = new Hex();
//		 String edcodedString = (Strinhex.decode(encodedString);
		 
		 
		 
		 Decoder decoder = new Hex();
		 
		 System.out.println(decoder.decode(encodedString).toString());
		 
		 assertThat(encodedString, is(encodedPw));
		 
		 
	}

}
