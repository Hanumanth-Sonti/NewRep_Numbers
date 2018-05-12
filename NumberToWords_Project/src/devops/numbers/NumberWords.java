package devops.numbers;

public class NumberWords {

	private static int DIVISOR = 3;
		
	public String toWords( int number ) {		
		 String result = "" ;			 
		 if( number < 0 ) result = "Number out of range";			 
		 else if( number > 0 && number % DIVISOR == 0) result = "Valid Number";
		 else if( number > 0 && number % DIVISOR != 0) result = String.valueOf( number ) ;
		 else if( number == 0) result = "Number is Zero";		 		 
		 return result;
	}
}
