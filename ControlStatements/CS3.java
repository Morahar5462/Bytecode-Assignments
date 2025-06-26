//Write a program to check whether a number is negative, positive or zero?
import java.util.Scanner;
class CS3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

if(a>0)
  System.out.println("Positive");
else if(a<0)
  System.out.println("Negative ");
else
System.out.println("Zero");


}
}