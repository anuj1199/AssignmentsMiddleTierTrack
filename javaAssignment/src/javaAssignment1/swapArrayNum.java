//Swap the numbers in Array.
package javaAssignment1;

import java.util.Scanner;

public class swapArrayNum {

	public static void swap(int[] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6};
		System.out.println("Array before swapping");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		swap(arr,2,4);									//Indexes to be swapped by swap function...
		System.out.println("Array after swapping");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
