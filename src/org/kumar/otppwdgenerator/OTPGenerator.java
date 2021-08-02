/**
 * 
 */
package org.kumar.otppwdgenerator;

import java.util.Random;

/**
 * @author gaurkuku
 *
 */
public class OTPGenerator implements IGenerator{

	@Override
	public String generate(Integer length) {
		
		char[] generatedOTP = new char[length];
		Random random = new Random();
		for(int i =0; i<length; i++) {
			generatedOTP[i] =  numbers.charAt(random.nextInt(numbers.length()));
		}
		
		return String.valueOf(generatedOTP);
	}

}
