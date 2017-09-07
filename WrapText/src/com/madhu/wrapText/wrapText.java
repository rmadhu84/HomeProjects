/**
 * 
 */
package com.madhu.wrapText;


/**
 * @author ramachandranm1
 *
 */
public class wrapText {

	/**
	 * 
	 */
	public wrapText() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		//String text = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		StringBuilder wrapped = new StringBuilder(text.length()) ;
		int lineSize = 20;
		String[] word = text.split(" ");
		String separator = System.lineSeparator();
		StringBuilder line = new StringBuilder();

		for (int i = 0; i<= word.length-1; i++) {
			line.append(" ");
			if(line.length()+word[i].length() < lineSize){                      
				line.append(word[i]);
			}else {
				line.append(separator);
				wrapped.append(line);
				line = new StringBuilder();
				line.append(word[i]);
			}

		}
		wrapped.append(line);
		System.out.println(wrapped.toString().trim());
	}
}


