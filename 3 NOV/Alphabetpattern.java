

/*
 Q3.3)Write a program to display the following pattern

A
BC
DEF
GHIJ
KLMNO
 */
package shweta;

public class Alphabetpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j;
		char ch='A'; // alphabetic patter
		for(i=1;i<=5;i++) { // for row
			for(j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
