package commonQuestion;

import java.util.Scanner;

public class SwapingWithoutThirdVariable {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Befor swaping");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("a="+a+"  b="+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("Ater swaping");
      System.out.println("a="+a+"  b="+b);
		}
	}

}
