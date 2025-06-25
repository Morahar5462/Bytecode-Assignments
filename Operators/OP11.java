/*Write a Java program to check if a given year is a leap year using the ternary operator?  */

import java.util.Scanner;
class OP11
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
//String s=((a%4==0)?((a%100!=0)?"Leap Year":((a%400==0)?"leap year":"Not leap year")):"Not leap year");
String s=((a%4==0 && a%100 !=0)||(a%400==0))?"Leap year":"Not leap year";
System.out.println(s);
}
}