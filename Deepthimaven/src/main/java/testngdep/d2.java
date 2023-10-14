package testngdep;

import org.testng.annotations.Test;

public class d2 {
	
	@Test(priority=0,groups="K")
	public void ab()
	{
		System.out.println("tc1");
	}
	
	@Test(priority=1,groups="K")
	public void bc()
	{
		System.out.println("tc2");
	}
	
	@Test(priority=2,dependsOnGroups="K")
	public void e()
	{
		System.out.println("tc3");
	}
	
	
	//Group k : ab, cb  : pass     e-> pass
	// even 1 fail                 e-> skippe d
	



}
