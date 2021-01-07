package javaAssesment1;

public class Question7 {

	/*
	 * Write a Java program to compute the specified expressions and print the output.
	 * Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
	 * Expected Output
	 * 2.138888888888889
	 */

	public static void main(String[] args) {
//		double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//		System.out.println(d);

		// Creating the variables and assign the value
		double d1 = 25.5;
		double d2 = 3.5;
		double d3 = 40.5;
		double d4 = 4.5;
		double computeResult = (d1 * d2 - d2 * d2) / (d3 - d4);

		System.out.println(computeResult);

	}

}
