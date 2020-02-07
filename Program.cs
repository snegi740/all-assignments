using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter 1st number :");
            int num1 = Convert.ToInt32( Console.ReadLine());
            Console.Write("Enter 2nd number :");
            int num2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter 1 for Addition :");
            Console.WriteLine("Enter 2 for Subtraction :");
            Console.WriteLine("Enter 3 for Multiplication :");
            Console.WriteLine("Enter 4 for Division :");
            Console.WriteLine("Enter 5 for Power :");

            int op = Convert.ToInt32(Console.ReadLine());


            callMyMethod(num1, num2, op);
            

            // Console.WriteLine();

        }
        static void callMyMethod( int a, int b, int c)
        {
            switch (c)
            {
                case 1:
                    Console.WriteLine(a + b);
                    break;
                case 2:
                    Console.WriteLine(a - b);
                    break;
                case 3:
                    Console.WriteLine(a * b);
                    break;
                case 4:
                    Console.WriteLine(a / b);
                    break;
                case 5:
                    Console.WriteLine(power(a,b));
                    break;
                default:
                    Console.WriteLine("enter correct option for operation");
                    break;
            }
            double power(int x, int y)
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
    }
}
