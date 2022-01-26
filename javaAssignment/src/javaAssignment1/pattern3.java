//WAP to print following pattern 
/* 
 
 *
 **
 ***
 ****
 *****
 for n=5
 */
package javaAssignment1;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
