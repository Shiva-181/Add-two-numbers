package javabasics;

//Given the gender and the age, check eligibility for marriage
public class marriageeligibility {

	public static void main(String[] args) {
		
		//Gender is a character - 'M' or 'F'
		
		char gender = 'M';
		int age = 29;
		
		if ( 
				( (gender == 'F') && (age >= 18) ) || 
				( (gender == 'M') && (age >= 21) ) 
			) {
			
			System.out.println("Eligible for marriage");
			
		} else {
			
			System.out.println("Not eligible for marriage");
			
		}
	}

}
