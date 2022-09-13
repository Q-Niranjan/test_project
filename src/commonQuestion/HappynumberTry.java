package commonQuestion;

public class HappynumberTry {

	public static void main(String[] args) {
		int hno=97,rem,sum1=0;
		
		while(sum1!=1 && sum1!=4)
		{sum1=0;
			while(hno>0)
			{
				rem=hno%10;
				sum1=sum1+rem*rem;
				hno/=10;
				
				
			}
			hno=sum1;
		}
	if(sum1==1)   System.out.println("Yes happy number");
	else System.out.println("No Happy number");
		
		
	}

}
