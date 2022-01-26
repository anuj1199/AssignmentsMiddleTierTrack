//WAP to print following pattern 
/* 
 1
 22
 333
 4444
 for n=4
 */

package javaAssignment1;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
