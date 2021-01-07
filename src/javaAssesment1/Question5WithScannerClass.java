package javaAssesment1;

import java.util.Scanner;

public class Question5WithScannerClass {
	/*
	 * Write a Java program that takes two numbers as input and display the product
	 * of two numbers. Test Data: Input first number: 25 Input second number: 5
	 * Expected Output​ : 25 x 5 = 125
	 */
	public static void main(String[] args) {
		// Getting input from a user
		// Creating variables
		int firstNumber, secondNumber;

		// Creating object for scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number please:");
		firstNumber = input.nextInt();

		System.out.println("Input second number please:");
		secondNumber = input.nextInt();

		System.out.println("The Output of the program is: " + (firstNumber * secondNumber));
		input.close();

	}

}
