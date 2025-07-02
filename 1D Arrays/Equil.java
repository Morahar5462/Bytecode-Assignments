package javapackage;

import java.util.Scanner;

public class Equil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean haseq=false;
		System.out.println("Enter no of elements:");
		   int n=sc.nextInt();
		   int a[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   a[i]=sc.nextInt();
		   }

		   for(int i=1;i<=n-2;i++)
		   {
			   int eq=a[i];
			   int lsum=0;
			   int rsum=0;
			   for(int j=0;j<i;j++)
			   {
				   lsum+=a[j];
			   }
			   for(int k=i+1;k<n;k++)
			   {
				   rsum+=a[k];
			   }
			   if(lsum==rsum)
			   {   
				   haseq=true;
				   System.out.println("Equilibrium point: "+eq);
				   break;
			   }
			   

		   }
		   if(haseq==false)
			   System.out.println("No equilibrium point");

	}

}
