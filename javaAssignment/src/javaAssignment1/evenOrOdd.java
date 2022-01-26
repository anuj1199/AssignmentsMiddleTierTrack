//WAP to find whether the number entered by user is even or odd.

package javaAssignment1;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The number entered is even");
		}
		else {
			System.out.println("The number entered is odd");
		}
	}
}
