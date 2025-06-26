//Write a program to check whether a year is leap year or not?
import java.util.Scanner;
class CS6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

if ((a%4==0 && a%100!=0)||(a%400==0))
    System.out.println("Leap Year");
 else 
    System.out.println("Not Leap Year");


}
}