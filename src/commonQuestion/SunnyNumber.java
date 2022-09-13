package commonQuestion;

public class SunnyNumber {

	public static void main(String[] args) {
	int sunnyno=15;
	int ext=sunnyno+1;
	  
		 double squareroot=Math.sqrt(ext);  
	  
       System.out.println(squareroot);
       
       if((int)squareroot==squareroot)System.out.println("sunny number");
       else System.out.println("Not a sunny number");
       
	}

}
