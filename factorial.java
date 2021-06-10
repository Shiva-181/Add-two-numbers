package javabasics;

//Find the factorial
/*
*  0! = 1
*  1! = 1
*  n! = n*(n-1)*...*1
* 
* Not defined for negative numbers
* 
*/
public class factorial {
	
	public static void main(String[] args) {
		
		int number = 5;
		int factorial = 1;
		
		if ( number < 0 ) {
			
			System.out.println("Factorial does not exist. Number is negative.");
			
		} else {
			
			for (int i=1 ; i <= number ; i++) {
				
				//factorial = factorial * i;
				
				factorial *= i;
				
			}
			
			System.out.println(number + "! = " + factorial);
			
		}
				
	}

}
