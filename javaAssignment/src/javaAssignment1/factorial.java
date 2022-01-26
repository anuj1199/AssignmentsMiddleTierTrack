//WAP to calculate and display the factorial of a number entered by a user.
package javaAssignment1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}

}
