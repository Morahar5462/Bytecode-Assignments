//Write a program to check whether a number is divisible by 5 and 11 or not?
import java.util.Scanner;
class CS4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

if (a%5==0 && a%11==0) {
    System.out.println("Divisible by both 5 and 11");
} else if (a%5==0) {
    System.out.println("Divisible only by 5");
} else if (a%11==0) {
    System.out.println("Divisible only by 11");
} else {
    System.out.println("Not divisible by 5 or 11");
}

}
}