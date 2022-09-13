package commonQuestion;

public class NeonNumber {

	public static void main(String[] args) {
		int Nno=9,sum=0,rem;
		int Square=Nno*Nno;
		//System.out.println(Square);
		
		for(int i=0;i<=Square;i++)
		{
			rem=Square%10;
			sum=sum+rem;
			Square=Square/10;
		}
		if(Nno==sum) System.out.println(Nno+" Is is neon number");
		else System.out.println(Nno+" is not neon number");
	}

}
