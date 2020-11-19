/**
 * 
 */
package com.sreeluck.java.sreeluck_java_tutorials.operators;

/**
 * @author sxm147
 *
 */
public class IncrementDecrementOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = ++a;

		// uncomment below line to see error
		// b = 10++;

		System.out.println(b);
// Nesting increment
//		int a = 10; 
//        int b = ++(++a); 
//        System.out.println(b);

		//		final to variable
//		final int a = 10; 
//        int b = ++a; 
//        System.out.println(b);
		
//		error: bad operand type boolean for unary operator '++'
//		boolean b = false; 
//        b++; 
//        System.out.println(b);
	}
}
