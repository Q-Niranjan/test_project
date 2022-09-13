package commonQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			int  a=sc.nextInt();
			int i;
			for( i=1;i<=a;i++)
			{
				if(a==0) System.out.println(a+" Is not  a prime");
				else if(a==1) System.out.println(a+" Is not  a prime");
				if(a%i==2)
				 {
					System.out.println(a+" Is a prime");
					break;
				 }
			}
		}
		
			
		
		
	}

}
