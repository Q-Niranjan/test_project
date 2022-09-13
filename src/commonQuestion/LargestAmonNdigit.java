package commonQuestion;

import java.util.Scanner;

public class LargestAmonNdigit {

	public static void main(String[] args) {
		System.out.println("How many number you want to enter?");
		try (Scanner sc = new Scanner (System.in)) {
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter number");
			for(int i=0;i<n;i++)
			{
			 a[i]=sc.nextInt();
			}
			int m=0;
			for(int j=0;j<n;j++)
			{
				if(a[j]>m)
				{
					m=a[j];
				}
			}
			System.out.println(m+" is largest number");
		}
	}

}
