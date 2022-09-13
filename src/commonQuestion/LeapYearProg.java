package commonQuestion;

public class LeapYearProg {

	public static void main(String[] args) {
		int year=8000;
		if(year%400==0 && year%4==0)
		{
			System.out.println("Leap year hai bhaii");
		}
		else if(year%100==0) System.out.println("not a leap year");
		else
		{
			System.out.println("not a leap year");
		}
	}

}
