package javafourquestions;
import java.util.Scanner;

public class MyCalculator {
	public static void main(String args[]) {
		
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
     
	}
	
	
	public static void callMyMethod( int a, int b, int c) {
 
		switch (c)
		{
         	case 1:
         		System.out.println(a + b);
         		break;
         	case 2:
         		System.out.println(a - b);
         		break;
         	case 3:
         		System.out.println(a * b);
         		break;
         	case 4:
         		System.out.println(a / b);
         		break;
         	case 5:
         		System.out.println(power(a,b));
         		break;
         	default:
         		System.out.println("enter correct option for operation");
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

}
