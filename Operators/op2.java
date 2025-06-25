//) Greatest of four numbers using nested ternary operator
import java.util.Scanner;
class op2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int lar= (a>b?a:b)>(c>d?c:d)?(a>b?a:b):(c>d?c:d);
System.out.println("largest Number: "+lar);
}
}