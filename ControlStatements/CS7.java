//Write a program to check whether a character is alphabet or not?
import java.util.Scanner;
class CS6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);

if (Character.isLetter(a))
    System.out.println("Alphabet");
 else 
    System.out.println("Not Alphabet");


}
}