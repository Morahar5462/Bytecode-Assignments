//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the  resultant value by 5. Display the final result.(Using Assignment Operators)

class op1
{
public static void main (String  args[])
{ 
   int n= 2345;
   n+= 8;
   n/=3;
   n%=5;
   n*=5;
   System.out.println(n);
}
}
   