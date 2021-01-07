package javaAssesment1;

import java.util.Scanner;

public class Question13 {

	/*
	 * Write a Java program to accept a number and check the number is even or not.
	 * Prints 1 if the number is even or 0 if the number is odd. Sample Output:
	 * Input a number: 20 1
	 */

	public static void main(String[] args) {
		// Creating object for scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = input.nextInt();

		if (num % 2 == 0) {
			System.out.println("1: The number is even");
		} else {
			System.out.println("0: The number is odd");
		}
		input.close();

	}

}
