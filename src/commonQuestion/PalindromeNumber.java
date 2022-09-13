package commonQuestion;

public class PalindromeNumber {

	public static void main(String[] args) {
		int A=11111111;
		int b=11111111;
		int rem,sum=0;
		while(A!=0)
		{
			rem=A%10;
			sum=sum*10+rem;
			A=A/10;
		}
		if(sum==b) System.out.println("p number");
		

	}

}
