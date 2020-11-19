/**
 * 
 */
package com.sreeluck.java.sreeluck_java_tutorials.operators;

/**
 * @author sxm147 BODMAS RULE BODMAS is an acronym and it stands for Bracket,
 *         Order, Division, Multiplication, Addition, and Subtraction. In
 *         certain regions, PEMDAS (Parentheses, Exponents, Multiplication,
 *         Division, Addition, and Subtraction) is used, which is the synonym of
 *         BODMAS.
 * 
 *         In the United States, the acronym PEMDAS is common. It stands for
 *         Parentheses, Exponents, Multiplication/Division,
 *         Addition/Subtraction. PEMDAS is often expanded to the mnemonic
 *         "Please Excuse My Dear Aunt Sally"
 */
public class ArithmeticOperators {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

		// precedence rules for arithmetic operators.
		// (* = / = %) > (+ = -)
		// prints a+(b/d)
		System.out.println("a+b/d = " + (a + b / d));

		// if same precendence then associative
		// rules are followed.
		// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
		System.out.println("a+b*d-e/f = " + (a + b * d - e / f));
	}
}
