package test;

import java.util.Scanner;

public class EvenNumCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int num = scanner.nextInt();
		
		if(num%2==0) {
			
			System.out.println("Even Number");
		}else {
			
			System.out.println("Odd Number");
		}


	}

}
