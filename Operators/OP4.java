/*Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers*/
import java.util.Scanner;
class OP4
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Sum: "+(a+b));
  System.out.println("Multiply: "+(a*b));
  System.out.println("Subtract: "+(a-b));
  System.out.println("Divide: "+(a/b));
  System.out.println("Remainder: "+(a%b));
}
}