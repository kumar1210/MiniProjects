/**
 * 
 */
package org.kumar.otppwdgenerator;

/**
 * @author gaurkuku
 *
 */
public interface IGenerator {
	
	public static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	public static final String specialChar = "!@#$%^&*_=+-/.?<>)(><;:";
	public static final String numbers = "0123456789";
	
	
	public String generate(Integer length);

}
