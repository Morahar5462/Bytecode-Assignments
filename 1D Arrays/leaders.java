package javapackage;
import java.util.Scanner;
public class leaders {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		   int n=sc.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   int max=a[n-1];
		   System.out.println(max);
		   for(int i=n-2;i>=0;i--)
		   {
			   if(a[i]>max)
			   {
				  max=a[i];
				  System.out.println(max);
			   }
		   }
	}

}
