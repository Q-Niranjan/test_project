package commonQuestion;

public class PerfectNumber {

	public static void main(String[] args) {
											//6=1+2+3, 28=1+2+4+7+14
		int Pno=6,sum=0;
		
		for(int i=1;i<Pno;i++)
		{
			if(Pno%i==0)
			{
				sum=sum+i;
			}
		}
		if(Pno==sum)System.out.println(Pno+"  is perfect number hai bhaii");
		else System.out.println(Pno+" is not perfect number");
	}

}
