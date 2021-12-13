package FactorialED;

public class FactorialED {

	public static void factorial(int num) {
		int count = 1;
		int fact = 1;
		while (count <= num) {
			fact = fact * count;
			count++;
		}
		System.out.println("Factorial: " + fact);
	}

	public static void main(String[] args) {
		factorial(8);
		factorial(12);
		factorial(5);
		factorial(5);
	}
}