//WAP to reverse an array
package javaAssignment1;

import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		System.out.println("Reverse of an Array:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
