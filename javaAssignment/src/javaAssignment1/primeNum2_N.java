//Get an integer N, print all the prime numbers that lie in the range 2 to N(both inclusive).
package javaAssignment1;

import java.util.Scanner;

public class primeNum2_N {
	
	static boolean isPrime(int n)
	{
		if (n <= 1) {
		    return false;
		}
		 
		for (int i = 2; i <n; i++) {
		    if (n % i == 0) {
		        return false;
		    }
		}
		return true;
	}
	
	static void printPrime(int n)
	{
		for (int i = 2; i <= n; i++)
		{
		    if (isPrime(i)) {
		        System.out.print(i + " ");
		    }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Prime numbers from 2 to "+n+" : ");
		printPrime(n);
	}

}
