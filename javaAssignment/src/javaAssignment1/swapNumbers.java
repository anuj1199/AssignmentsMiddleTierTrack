//WAP to swap the values of 2 numbers(Take input from the user).
package javaAssignment1;

import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The values after swapping: a="+a+" and b="+b);
	}
}
