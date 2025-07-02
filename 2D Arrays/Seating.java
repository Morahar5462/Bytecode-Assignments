package twoD_arrays;
import java.util.Scanner;

public class Seating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Marks of Students");
	System.out.print("Enter the no of students: ");
	int st=sc.nextInt();
	System.out.print("Enter the no of subjects: ");
	int sub=sc.nextInt();
	int[][] a=new int[st][sub];

	for(int i=0;i<st;i++)
	{
		System.out.println("Student "+(i+1)+" Details");
		int sum=0;
		for(int j=0;j<sub;j++)
		{
			System.out.print("Subject "+(j+1)+" Marks: ");
			a[i][j]=sc.nextInt();
			sum+=a[i][j];
			
		}
		System.out.println("Student "+(i+1)+" Total: "+sum);
		
	}
	
		
	}

}
