package javaAssesment1;

import java.util.Scanner;

public class Question10 {

	/*
	 * Write a Java program to count the letters, spaces, numbers and other
	 * characters of an input string.
	 * Expected Output The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
	 * letter: 23 space: 9 number: 10 other: 6
	 */

	public static void main(String[] args) {
		// Declare variables
		char[] ch;
		String str;
		int letter = 0, space = 0, num = 0, other = 0, length;
		// Creating scanner class
		Scanner input = new Scanner(System.in);
		System.out.print("Input your string: ");
		str = input.nextLine();
		ch = str.toCharArray();
		length = str.length();

		for (int i = 0; i < length; i++)
			if (Character.isLetter(ch[i])) 
			{
				letter++;
			}
			 else if (Character.isSpaceChar(ch[i])) 
			 {
				 space++;
			 }
			 else if (Character.isDigit(ch[i])) 
			 {
				num++;
			 }
			 else 
			 {
				other++;
			 }
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Others : " + other);

		input.close();

	}

}
