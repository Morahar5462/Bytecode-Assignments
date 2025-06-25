/* Write a Java program to determine the sign of a given number (positive, negative, or zero) using the ternary operator?*/
import java.util.Scanner;
class OP12
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
String s=(a>0)?"Positive":((a==0)?"Zero":"Negative");
System.out.println(s);
}
}