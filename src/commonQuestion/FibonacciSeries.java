package commonQuestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number till you would like to find fibonacci series");
		int fno=0,sno=1,result,userno;
		try (Scanner sc = new Scanner(System.in)) {
			userno=sc.nextInt();
		}
		System.out.println("Fibonacci Series Here!");
		System.out.println(fno+"\n"+sno);
		while(true)
		{
			result=fno+sno;
			if(result>=userno)
			{
				break;
			}
			fno=sno;
			sno=result;
			System.out.println(result);
		}
	}

}
