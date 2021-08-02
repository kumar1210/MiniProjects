/**
 * 
 */
package org.kumar.otppwdgenerator;

/**
 * @author gaurkuku
 *
 */
public class ApplicationLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IGenerator otpPwdGenerator = new PassWordGenerator();
		System.out.println("The new password of length 8 : "+ otpPwdGenerator.generate(8));
		otpPwdGenerator = new OTPGenerator();
		System.out.println("The new OTP of 6 number is : "+ otpPwdGenerator.generate(6));
		
	}

}
