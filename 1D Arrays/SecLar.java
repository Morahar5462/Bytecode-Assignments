package javapackage;
import java.util.Scanner;
public class SecLar {

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
		   int max=a[n-1];
		   int nmax=a[n-2];
		   for (int i=0;i<n;i++)
		   {
			   if(a[i]>max)
				   max=a[i];
			   else if (a[i] > nmax && a[i]!=max)
				   nmax=a[i];	   
		   }
		   System.out.println(nmax);
		   
	}

}
