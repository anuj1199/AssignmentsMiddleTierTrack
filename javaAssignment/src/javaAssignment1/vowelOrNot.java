//WAP to find whether the character entered by user is a vowel or not(solve using if..else and switch case).
package javaAssignment1;

import java.util.Scanner;

public class vowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char c1=Character.toLowerCase(c);
		
		// Method 1: If...else method
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("Character "+c+ " is a vowel");
		}
		else {
			System.out.println("Character "+c+ " is not a vowel");
		}
		
		// Method 2: Switch case method
		switch(c1) {
		case 'a':
			System.out.println("Character "+c+ " is a vowel");
			break;
		case 'e':
			System.out.println("Character "+c+ " is a vowel");
			break;
		case 'i':
			System.out.println("Character "+c+ " is a vowel");
			break;
		case 'o':
			System.out.println("Character "+c+ " is a vowel");
			break;
		case 'u':
			System.out.println("Character "+c+ " is a vowel");
			break;
		default:
			System.out.println("Character "+c+ " is not a vowel");
		}
				
	}

}
