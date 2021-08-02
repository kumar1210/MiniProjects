/**
 * 
 */
package org.kumar.otppwdgenerator;

import java.util.Random;

/**
 * @author gaurkuku
 *
 */
public class PassWordGenerator implements IGenerator{

	@Override
	public String generate(Integer length) {
		String absString = specialChar+numbers+upperCase+lowerCase;
		char[] newPassword = new char[length];
		Random random = new Random();
		for(int i=0; i<length; i++) {
			newPassword[i] = absString.charAt(random.nextInt(absString.length()));
		}
		return String.valueOf(newPassword);
	}

}
