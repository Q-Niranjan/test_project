package commonQuestion;



class facto{
	public int fact(int num)
	{int r=1;
		for(int i=1;i<=num;i++)
		{
			r = r*i;
		}
		
		return r;
		
	}
}
public class PascalTriangle {
	
 
	public static void main(String[] args) {

		facto f1=new facto();
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {

				
				System.out.print(
					" "
					+ f1.fact(i)
						/ (f1.fact(i - j)
							* f1.fact(j)));
			}

			// for newline
			System.out.println();
		}
	}

}
