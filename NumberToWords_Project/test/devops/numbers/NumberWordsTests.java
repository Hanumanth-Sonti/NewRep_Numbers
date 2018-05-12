package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}
	
	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "Minus One","Number out of range", numberWords.toWords( -1 )) ;		
	}
	
	@Test
	public void numberReturnsZero() {
		Assert.assertEquals( "Zero", "Number is Zero", numberWords.toWords( 0 ) ) ;
	}	
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "2", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numberThreeReturns() {
		Assert.assertEquals( "Three", "Valid Number", numberWords.toWords( 3 ) ) ;
	}	
	
	
}
