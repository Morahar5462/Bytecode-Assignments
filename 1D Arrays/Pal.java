package javapackage;

import java.util.Scanner;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		   int n=sc.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   int k=n-1;
		   boolean ispal=true;
		   for (int j=0;j<n/2;j++)
		   {
			   if(a[j]!=a[k]) {
				   ispal=false;
				   break;}
			   else
				   k--;
				   
		   }
		   if(ispal)
			   System.out.println("Array is palindrome");
		   else
			  System.out.println("Array is not  palindrome");
	}

}
