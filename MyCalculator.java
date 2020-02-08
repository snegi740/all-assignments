package javafourquestions;
import java.util.Scanner;

public class MyCalculator {
	
	public static void main(String args[]) {
		
		System.out.println("This calculator only takes numbers as input");
		//i know i didn't handle the string input exception or the empty input exception.
		
		takingInput();     //calling only one method as said to
     
     
	}
     
	public static void callMyMethod( int a, int b, int c) {
 
		switch (c)
		{
         	case 1:
         		System.out.println(a + b);  // addition , possible even with -ve numbers
         		break;
         	case 2:
         		System.out.println(a - b);  // subtraction
         		break;
         	case 3:
         		System.out.println(a * b); // multiplication
         		break;
         	case 4:
         		if(b==0) {
         		System.out.println("Can't divide by Zero");}  // division with exception handled
         		else {
         			System.out.println(a/b); 
         		}break;
         	case 5:
         		if (b>=0) {
         		System.out.println(power(a,b));}
         		else {
         			System.out.println("Can't power negative numbers");   //didn't add the functionality of negative powers
         		}
         		break;
         	default:
         		System.out.println("enter correct option for operation"); //for wrong input
         		break;
		}
		}
		public static int power(int x, int y)
		{
			int i;
			int sum = 1;
			for (i = 0; i < y; i++)
			{
				sum = sum * x;

			}
			return sum;

		}
		public static void takingInput() {
			
			
			
			System.out.println("Enter 1st number :");
			 Scanner s1 = new Scanner(System.in);
			     int p1 = s1.nextInt();	
			 System.out.println("Enter 2nd number :");
			 Scanner s2 = new Scanner(System.in);
		    	 int p2 = s2.nextInt();
		    	
			 System.out.println("Enter 1 for Addition :");
			 System.out.println("Enter 2 for Subtraction :");
			 System.out.println("Enter 3 for Multiplication :");
			 System.out.println("Enter 4 for Division :");
			 System.out.println("Enter 5 for Power :");

			 System.out.println("Enter operation :");
			 Scanner s3 = new Scanner(System.in);
				int p3 = s3.nextInt();
			 

		     callMyMethod(p1, p2, p3);
		     System.out.println("Do you want to perform calculation again."
		     		+ " Press 0 for yes and any other number for exit."); 
		     // added functionality for multiple calculations.
		     Scanner s4 = new Scanner(System.in);
		     	int p4 = s4.nextInt();
		     	if (p4 == 0) {
		     		takingInput();
		     	}
		     	
		}
}

