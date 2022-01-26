//Given a number N,print sum of all even numbers from 1 to N.
package javaAssignment1;

import java.util.Scanner;

public class sumOfEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=2;i<=n;i+=2) {
			sum=sum+i;
		}
		System.out.println("Sum of all even numbers from 1 to N = "+sum);
	}

}
