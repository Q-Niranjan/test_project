package commonQuestion;

public class HappyNumber {

	public static void main(String[] args) {
		int hno=94,sum=0,rem;
		
		while(sum!=1 && sum!=4)
		{
            sum=0;
			while(hno>0)
			{
				rem=hno%10;
				hno/=10;
				sum=sum+(rem*rem );
			}
			
			hno=sum;
			
		}

		if(sum==1) {
			System.out.println("Happy number");
			
		}
		
	}

}
