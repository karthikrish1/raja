package testngattribute;

import org.testng.annotations.Test;

public class t1 {
	
	/*testng : test next generation
	 * testing framework
	 * inspired from JUNIt
	 * annotations, attirbute, parallel suite execution
	 * automatic report generation
	 * 
	 * 
	 * test case
	 *    nonstatic
	 *    @Test
	 *    default order: alphabetical order
	 *    
	 *    
	 *    priority: arrange the test case in particular order
	 *    description : adding short note on the test case 
	 *    groups
	 *    invocationcount- run the same test case for multiple time  
	 *    enabled=false ; disabling/ignoring
	 *    timeout: fix timelimit fr test case
	 *    * 
	 * */
	
	@Test(priority=0,description="This s one",groups="One",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("test case 1");
	}
	
	@Test(priority=1,description="Two",groups="One")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="Three",groups="Two")
	public void m2()
	{
		System.out.println("Test case 3");
	}

}
