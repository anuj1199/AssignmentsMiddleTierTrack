//WAP to find the greatest of the 3 numbers and display the output(Take the inputs from user).
package javaAssignment1;

import java.util.Scanner;

public class greatestOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("The greatest of the 3 numbers is: "+a);
			}
			else {
				System.out.println("The greatest of the 3 numbers is: "+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("The greatest of the 3 numbers is: "+b);
			}
			else {
				System.out.println("The greatest of the 3 numbers is: "+c);
			}
		}
	}

}
