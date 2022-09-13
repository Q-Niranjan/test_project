package commonQuestion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		try {
			try (Scanner sc = new Scanner(System.in)) {
				long  a=sc.nextLong();
				int  sum=1;
				for(int  i=1;i<=a;i++)
				{
					 sum=sum*i;
				}
				 System.out.println("Factorial="+sum);
			}
		}
		catch(Exception e) {System.out.println(e);}
		
	}

}
