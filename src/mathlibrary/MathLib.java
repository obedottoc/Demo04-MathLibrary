/***
 * This library contains basic mathematics functions used in engineering applications
 * Developed by
 * C.Obed Otto
 * Associate Professor
 * Saveetha Engineering College
 * obedotto@saveetha.ac.in
 * 
 *  
 */
package mathlibrary;

/***
 * Contain engineering mathematics functions
 * 
 * @author obedotto@saveetha.ac.in
 *
 */
public class MathLib {

	
	/******
	 * This function calculates the factorial of a given number
	 * @param n integer number to find factorial
	 * @return factorial of the given number
	 */
	public static long factorial(int n)
	{
		long fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}
}
