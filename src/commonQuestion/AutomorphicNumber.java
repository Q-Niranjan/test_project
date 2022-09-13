package commonQuestion;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int Ano=1001,sum1=0,sum=0,rem1,rem,c=0;
		int square=Ano*Ano;
		int Bno=Ano;
		for(int i=1;i<=Bno;i++)
		{
			rem1=Bno%10;
			sum1=sum1*10+rem1;
			Bno/=10;
			c++;
		}
		
		System.out.println(c);
	
		
		
		
		for(int i=1;i<Ano;i++)
		{
			rem=square%10;
			sum=sum*10+rem;
			square/=10;
			if(i==c) break;
			
		}
		
		if(sum1==sum)System.out.println("Atomorphic number");
		else System.out.println("not Automorphic number");
    // System.out.println(sum);
	}

}
