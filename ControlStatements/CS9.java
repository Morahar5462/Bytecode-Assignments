//Write a program to input any character and check whether it is alphabet, digit or special character?
import java.util.Scanner;
class CS9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if(Character.isLetter(a))
System.out.println("Alphabet");
else if(Character.isDigit(a))
System.out.println("Digit");
else
System.out.println("Special Character");

}
}