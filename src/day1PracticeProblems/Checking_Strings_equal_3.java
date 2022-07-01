package day1PracticeProblems;

import java.util.Scanner;

public class Checking_Strings_equal_3 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * taking two strings from user
		 * checking wheather two strings are equal or not
		 */
		System.out.println("Enter a String");
		Scanner one = new Scanner(System.in);
		String Str1 = one.next();
		Scanner two = new Scanner(System.in);
		String Str2 = one.next();

		boolean equal = Str1.equals(Str2);
		System.out.println("string 1 is equal to string 2 " + equal);
	}

}
