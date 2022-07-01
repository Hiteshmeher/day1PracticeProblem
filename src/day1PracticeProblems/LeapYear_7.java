package day1PracticeProblems;

import java.util.Scanner;

public class LeapYear_7 {

	public static void main(String[] args) {
		int length = 4;
		boolean leap = false;
		System.out.println("Enter the Year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int yearLength = String.valueOf(year).length();
		if (length == yearLength) {
			if (year >= 1582) {

				if (year % 4 == 0) {
					System.out.println(year + " is a leap year.");
				} else if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else if (year % 100 == 0) {
					System.out.println(year + " is not a leap year.");
				} else
					System.out.println(year + " is not a leap year.");
			}
			else
				System.out.println("Invalid Input ! \nPlease input after 1582");

		}
		else
			System.out.println("Invalid Input !! \nPlease Enter 4 digits number only");


	}
}
