package javafourquestions;
import java.util.Scanner;

public class MyCalculator {
	
	public static void main(String args[]) {
		
		System.out.println("This calculator only takes numbers as input");
		
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
         		try {
         		if ( a <0 || b<0) {
         			throw new Exception ("");
         		}
         		System.out.println(power(a,b));
         		} catch (Exception e) {
         		System.out.println("a or b can't be negative");
         		}
         		break;
         	default:
         		System.out.println("Enter correct option for operation"); //for wrong input
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
			
			int p1, p2, p3;
			
			System.out.println("Enter 1st number :");
			 Scanner s1 = new Scanner(System.in);
			 	try {
			 		p1 = s1.nextInt();	
			     
			 
			 System.out.println("Enter 2nd number :");
			 Scanner s2 = new Scanner(System.in);
		    	 p2 = s2.nextInt();
		    	
			 System.out.println("Enter 1 for Addition :");
			 System.out.println("Enter 2 for Subtraction :");
			 System.out.println("Enter 3 for Multiplication :");
			 System.out.println("Enter 4 for Division :");
			 System.out.println("Enter 5 for Power :");

			 System.out.println("Enter operation :");
			 Scanner s3 = new Scanner(System.in);
				p3 = s3.nextInt();
			
			 

		     callMyMethod(p1, p2, p3);
		}
		     catch (Exception e) {
			 		System.out.println("Incorrect form of input");
			 		takingInput();
			 	}
		     System.out.println("Do you want to perform calculation again." + "\n"
		     		+ "Press 0 for yes and any other number for exit."); 
		     // added functionality for multiple calculations.
		     Scanner s4 = new Scanner(System.in);
		     	int p4 = s4.nextInt();
		     	if (p4 == 0) {
		     		takingInput();
		     	}
		     	else {
		     		return;
		     	}
		     	
		}
		
		

}

