/* Write a Java function to swap two variables without using a third variable? */
import java.util.Scanner;
class OP13
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 a=a^b;
 b=a^b;
 a=a^b;
 System.out.println(a+" "+b);
}
}