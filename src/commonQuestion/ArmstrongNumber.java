package commonQuestion;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int Ano=370,rem,sum=0;
		int Bno=Ano;
		for(int i=0;i<=Bno;i++)
		{
			rem=Ano%10;
			sum=sum+rem*rem*rem;
			Ano=Ano/10;
		}
		if(Bno==sum)System.out.println(Bno+" is armstrong number");
		else System.out.println(Bno+" is not armstrong number");
	}

}
