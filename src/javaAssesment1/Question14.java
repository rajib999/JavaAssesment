package javaAssesment1;

//import java.util.Scanner;

public class Question14 {

	/*
	 * Write a Java program to convert a string to an integer in Java. Sample
	 * Output: Input a number(string): 25 The integer value is: 25
	 */

	public static void main(String[] args) {

		 //Convert String to integer
		 String s = "25";
		 
		 //Printing the program
		 System.out.println(Integer.parseInt(s));
		 
		// Verifying the program does it convert String to int or not.
		 System.out.println(Integer.parseInt(s)+5);

//		String s;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Input a String:");
//		s = input.nextLine();
//		System.out.println(Integer.parseInt(s));
//
//		//Verifying the program does it convert String to int or not.
//		System.out.println(Integer.parseInt(s) + 25);
//		input.close();

	}

}
