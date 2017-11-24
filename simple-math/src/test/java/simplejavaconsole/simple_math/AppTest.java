package simplejavaconsole.simple_math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public final void testAdd() {
		int x  = 1 ; int y = 1;
		System.out.println("Expected result is 2");
		int result = App.add(x,y);
		System.out.println("Actual result is : " + result);
	    assertEquals(2, result);
	}

	public final void testDiff() {
		int x  = 5 ; int y = 2;
		System.out.println("Expected result is 3");
		int result = App.diff(x,y);
		System.out.println("Actual result is : " + result);
	    assertEquals(3, result);  
	}

	public final void testProd() {
		int x  = 4 ; int y = 2;
		System.out.println("Expected result is 8");
		int result = App.prod(x,y);
		System.out.println("Actual result is : " + result);
	    assertEquals(8, result);
	}

	public final void testMod() {
		int x  = 9 ; int y = 2;
		System.out.println("Expected result is 1");
		int result = App.mod(x,y);
		System.out.println("Actual result is : " + result);
	    assertEquals(1, result);
	}
}
