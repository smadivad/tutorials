/**
 * 
 */
package com.sreeluck.java.sreeluck_java_tutorials.operators;

/**
 * @author sxm147 
 * Using + over (): When using + operator inside
 *         system.out.println() make sure to do addition using parenthesis. If
 *         we write something before doing addition, then string addition takes
 *         place, that is associativity of addition is left to right and hence
 *         integers are added to a string first producing a string, and string
 *         objects concatenate when using +, therefore it can create unwanted
 *         results
 *         
 */
public class ArithmeticOperatorsEx2 {
	public static void main(String[] args) {

		int x = 5, y = 8;

		// concatenates x and y as
		// first x is added to "concatenation (x+y) = "
		// producing "concatenation (x+y) = 5"
		// and then 8 is further concatenated.
		System.out.println("Concatenation (x+y)= " + x + y);

		// addition of x and y
		System.out.println("Addition (x+y) = " + (x + y));
	}
}
