//Write a program to input any alphabet and check whether it is vowel or consonant?
import java.util.Scanner;
class CS8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if(Character.isLetter(a))
{
  a=Character.toLowerCase(a);
  if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
  {
    System.out.println("Vowel");
 }
 else
 System.out.println("Consonant");
}
else
System.out.println("Enter the alphabet");




}
}