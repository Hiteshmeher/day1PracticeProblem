package day1PracticeProblems;

import java.util.Scanner;

public class Count_Invalid_integer_4 {

	static int Sum = 0;
	static int Count = 0;

	public static void main(String[] args) {
		for (int j = 0; j < args.length; j++) {
			System.out.println("Enter the number");
			System.out.println(args[j]);
			try {
				int n = Integer.parseInt(args[j]);
				Sum = Sum + n;
			} catch (NumberFormatException e) {
				Count++;
				System.out.println("");
			}
		}
		System.out.println("Sum is " + " " + Sum);
		System.out.println("Invalid count is " + Count);

	}

}
