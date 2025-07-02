package twoD_arrays;

import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Office Attendance Tracker");
		System.out.print("Enter the no of Employees: ");
		int st=sc.nextInt();
		System.out.print("Enter the no of working days: ");
		int sub=sc.nextInt();
		int[][] a=new int[st][sub];

		for(int i=0;i<st;i++)
		{
			System.out.println("Employee "+(i+1)+" Details");
			
			for(int j=0;j<sub;j++)
			{
				System.out.print("Day "+(j+1)+" : ");
				a[i][j]=sc.nextInt();
				
				
			}
			
			
		}
		for(int i=0;i<st;i++)
		{
			for(int j=0;j<sub;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
