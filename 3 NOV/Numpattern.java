/*Q2.1) Write a program to display the following pattern
 1
   10
  101
 1010
10101

*/

package shweta;

public class Numpattern {

	public static void main(String[] args) {
		
		
			int i,j;
			for(i=1;i<=5;i++)  // for row
			{
				for(j=1;j<=i;j++) // for column
				{
					if(j%2==0) {
						System.out.print("0");  // if condition is true then it print
					}
					else {
						System.out.print('1'); //if condition is false then it print
					}
				
				}
				System.out.println();
			}
		}
	}

	
			
			
			
				
			
		
	

	


