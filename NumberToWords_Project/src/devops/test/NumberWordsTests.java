package devops.test;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;	
	
	@BeforeClass
	public static void setupClass() throws Exception{
	   System.out.println(".....Start the execution of Numbers to Words tests.......");
	}
	
	@Before
	public void setup() throws Exception {
		numberWords = new NumberWords() ;
		System.out.println("....Before Class runs before any of the tests are run.......");
	}
	
	@Test
	public void numberOneReturnsOne() throws Exception {
		Assert.assertEquals( "Minus One","Number out of range", numberWords.toWords( -1 )) ;	
		System.out.println("-1 returns the word "+numberWords.toWords( -1 ));
	}
	
	@Test
	public void numberReturnsZero() throws Exception {
		Assert.assertEquals( "Zero", "Number is Zero", numberWords.toWords( 0 ) ) ;
		System.out.println("0 returns the word "+numberWords.toWords(0));
	}	
	
	@Test
	public void numberTwoReturnsTwo() throws Exception {
		Assert.assertEquals( "Two", "2", numberWords.toWords( 2 ) ) ;
		System.out.println("2 returns the word "+numberWords.toWords(2));
	}
	
	@Test
	public void numberThreeReturns() throws Exception{
		Assert.assertEquals( "Three", "Valid Number", numberWords.toWords( 3 ) ) ;
		System.out.println("3 returns the word "+numberWords.toWords(3));
	}		
	
	@After
	public void tearDown1(){
		 System.out.println(".....After executed after all tests are run.......");
	}	

	@AfterClass
	public static void tearDown2(){
		 System.out.println(".....After class executed post After is executed.......");
	}
	
}
