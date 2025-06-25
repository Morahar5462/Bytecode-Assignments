/* Write a Java program to compare two characters and print the results? */
import java.util.Scanner;
class OP9
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 char a=sc.next().charAt(0);
 char b=sc.next().charAt(0);
 System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
System.out.println(a==b);
System.out.println(a!=b);

}
}