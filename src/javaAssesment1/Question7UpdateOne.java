package javaAssesment1;

import java.util.Scanner;

public class Question7UpdateOne {

	/*
	 * Write a Java program that takes a number as input and prints its
	 * multiplication table up to 10. Test Data: Input a number: 8 Expected Output :
	 * 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
	 */

	public static void main(String[] args) {
		// Creating variables
		int number, multiplier;

		// Creating object for scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Input A Number :");
		number = input.nextInt();
		input.close();
		System.out.println("The Output Is:");

		for (multiplier = 1; multiplier <= 10; multiplier++) {
			System.out.printf("%d*%d=%d\n", number, multiplier, (number * multiplier));
		}

	}
}
