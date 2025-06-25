/* Consider the following code snippet:
int i = 10;
int n = i++%5;
  i) What are the values of i and n after the code is executed?
  ii)What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?*/

class OP3
{
 public static void main(String args[])
{
  int i=10;
  int n=i++%5;
  System.out.println("i: "+i);
  System.out.println("n: "+n);
  System.out.println("After Pre increment");
  i=10;
  n=++i%5;
  System.out.println("i: "+i);
  System.out.println("n: "+n);

  
}
}