package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 *before test: run only once before all the test cases started its execution
	 *after test : run only once after all the test cases finished its execution
	 *
	 *before class: run only once after before test
	 *after class: run only once before after test 
	 * 
	 * before method: run before each test case
	 * aftermethod:   run after each test case 
	 * 
	 *before test   : visiting webste 
	 *before class  : maximising 
	 *   before method : refresh  tc1 : title   aftermethod  : deleting cookies
	 *   before method : refresh  tc2 : click   aftermethpd  : deleting cookies 
	 * after class: url 
	 *after test  : closing 
	 * * 
	 * */
	ChromeDriver ob;
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method: refresh");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("aftermethod : coookies deletion");
		ob.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class: maximising");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void acc()
	{
		System.out.println("after class : url " + ob.getCurrentUrl());
	}
	
	@BeforeTest
	public void bt()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		System.out.println("before test : visiting website ");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.close();
	}
	@Test(priority=0)
	public void t1()
	{
		System.out.println("test case 1 : title " + ob.getTitle());
	}

	@Test(priority=1)
	public void t2()
	{
		System.out.println("test case 2: clicking");
		ob.findElementByLinkText("Help").click();
	}

}
