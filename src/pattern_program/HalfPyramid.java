package pattern_program;

public class HalfPyramid {

	/*
	         $
			 $ $
			 $ $ $
			 $ $ $ $
			 $ $ $ $ $
 
	 */
	public static void main(String[] args) {
		int n=5,m=6;
		for(int i=1;i<=n;i++)
		{for(int j=1;j<=i;j++) {
			
			System.out.print(" $");
		}
			System.out.println();
		}

	}

}
