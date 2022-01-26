//WAP to check whether the number entered by user is prime or not.
package javaAssignment1;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println(n+" is not a prime number");
			}
			else {
				System.out.println(n+" is a prime number");
			}
		}
	}

}
