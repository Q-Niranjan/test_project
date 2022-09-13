package commonQuestion;

public class FaciatingNumber {

	public static void main(String[] args) {
		int  n=1921;
		String strnum=""+n+(n*2)+(n*3);
		int freq[]=new int[110];
		
		for(int i=0;i<strnum.length();i++)
		{
			int digit=strnum.charAt(i)-'0';
			
			freq[digit]++;
			
		}
		
		for(int i=1;i<=9;)
		{
			if(freq[i]!=1) {System.out.println("not Faciating number"); break;}
			
			
			System.out.println(" faciating number");
			break;
		}

	}

}
