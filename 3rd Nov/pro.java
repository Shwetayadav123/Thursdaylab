//Accept age and gender from user and display the rate of interest as follow
AGE ABOVE 60 AND GENDER MALE (RI=7.0%)
  AGE ABOVE 60 AND GENDER FEMALE (RI=7.5%)
  AGE below 60 AND age (RI=5.0%)
package shweta;
import java.util.*;
public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter you age");
int a=sc.nextInt();
System.out.println("Enter your gender M for Male and F for Female");
char g=sc.next().charAt(0);
if(a>=60) {
	if(g=='f') {
		System.out.println("Rate of intrest 7.5%");
	}
	else {
		System.out.println("Rate of intrest 7.0%");
	}
	
	}
else {
		System.out.println("Rate of intrest 5.0%");
}
	}

}
