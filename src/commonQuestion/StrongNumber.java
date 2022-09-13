package commonQuestion;

public class StrongNumber {
	
		public int fact(int num) {
			int r=1;
			for(int i=1;i<=num;i++) {
				r=r*i;
			}
			
			return r;
		}
	public static void main(String[] args) {
		int Sno=145,sum=1,rem;
		int Sno2=Sno;
           StrongNumber sn=new StrongNumber();        		   
           for(int i=1;i<Sno;i++)
           {
        	   rem=Sno%10;
        	   sum=sum+sn.fact(rem);
        	   Sno=Sno/10;
           }
           //System.out.println(sum);
           if(Sno2==sum) System.out.println(Sno2+" is Strong number");
           else System.out.println(Sno2+" is not strong number");
	}

}
