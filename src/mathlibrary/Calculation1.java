/*******
 * To use mathlibrary functions
 * 
 * Developed by
 * C.Obedotto
 * Associate Professor
 * Saveetha Engineering College
 * obedotto@saveetha.ac.in
 * 
 */
package mathlibrary;

import java.util.*;

public class Calculation1 {

	public static void main(String[] args) {
	int n;
	long f;
	Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		n=sc.nextInt();
		f=MathLib.factorial(n);
		System.out.println("Factorial of "+n+" is "+f);
	}

}
