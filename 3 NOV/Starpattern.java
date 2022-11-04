/*
2.2 Write a program to display the following pattern 

    *         	
   ***		
  *****		
 *******		
********* 
 
 
 */
package shweta;

public class Starpattern {

	public static void main(String[] args) {
		//star();
		downwordstar() ;
	}
//		public static void star() {
//			int i,j;
//		for(i=1;i>=5;i++) // for row
//		{
//			for(j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(j=1;j<=2*1-1;j++) //for column
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//	}
//		}
//		
		/*Q3)Write a program to display the following pattern


		*********
		 *******
		  *****
		   ***
		    *
*/
		
		public static void downwordstar() {
			int x,y;
		for(x=5;x>=1;x--) // for row
		{
			for(y=5;y<=x;y++) {
				System.out.print(" ");
			}
			for(y=1;y<=x*2-1;y++) //for column
			{
				System.out.print("*");
			}
			System.out.println();
	}
	
		}
}


