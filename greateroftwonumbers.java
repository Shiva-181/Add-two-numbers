package javabasics;



//Find greater of two numbers
public class greateroftwonumbers {

	public static void main(String[] args) {

		int number1, number2;

		number1 = 20;
		number2 = 30;

		if (number1 > number2) {

			System.out.println("number1 > number2");

		} else if (number2 > number1) {

			System.out.println("number2 > number1");

		} else	/*if (number1 == number2)*/ {

			System.out.println("number1 equals number2");

		}

	}

}
