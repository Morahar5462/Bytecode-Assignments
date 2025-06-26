//Write a program to find maximum between three numbers?
import java.util.Scanner;
class CS2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b)
{
 if (a>c)
 System.out.println("Maximum: "+a);
 else 
 System.out.println("Maximum: "+c);
}
else
{
 if(b>c)
 System.out.println("Maximum: "+b);
 else
 System.out.println("Maximum: "+c);

}

}
}