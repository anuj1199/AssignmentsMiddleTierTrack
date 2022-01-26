//WAP to generate the reverse of a given number N. Print the corresponding reverse number.
package javaAssignment1;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+Character.toString(s.charAt(i));
		}
		System.out.println(s1);
	}
}
