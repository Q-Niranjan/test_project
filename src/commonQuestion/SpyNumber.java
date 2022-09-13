package commonQuestion;

public class SpyNumber {

	public static void main(String[] args) {
		int spy=123,sum=1,sum1=1,rem;
		for(int i=0;i<=spy;i++) {
			rem=spy%10;
			 sum=sum+rem;
			 sum1=sum1*rem;
			 spy=spy/10;
		}
//		System.out.println(sum);
//		System.out.println(sum1);
		
		if(sum==sum1) System.out.println("spy number");
		else System.out.println("not spy number");

	}

}
