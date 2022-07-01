package day1PracticeProblems;

public class StaticVariable_Method_Block_6 {
	/**
	 * initializing static variables
	 */
	static int a = 6;
	static int b;


	static void method(int n) {
		System.out.println("n = " + n);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		/**
		 * static block
		 */
		System.out.println("Static block ");
		b = a * 8;
	}

	public static void main(String args[]) {
		/**
		 * method
		 */
		method(99);
	}
}
