/*
 Q1) Accept age and gender from user and display the rate of interest as follow

age above 60 and gender Male (RI= 7 %)
age above 60 and gender FeMale (RI= 7.5 %)
below 60 age = RI 5%
 */

package shweta;
import java.util.*;
public class AgeGenderQues {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in); // for accepting value for user
	System.out.print("Enter the age:-");
	int age=sc.nextInt();
	System.out.print("Enter the gender M for male amd F for female:-");
	char gen=sc.next().charAt(0);
	if(age>=60)
	{
		if(gen=='f' || gen=='F') // this is for male
		{
			System.out.println("Rate of intrest=7.5%");				
		}
		else {
			System.out.println("Rate of intrest=7%"); // this is for female
		}
	}
		else {
			System.out.println("Rate of intrest=5%");
		}
}
}

