package testngdep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0,description="Visiting",groups="L")
	public void vwe()
	{
		//step1: configuring chromedriver 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
				 ob= new ChromeDriver();
				ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising",groups="L")
	public void ma()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing",invocationCount=3,groups="L")
	public void refres()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="L")
	public void click()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="quiting",dependsOnGroups="L",timeOut=4000)
	public void close()
	{
		ob.quit();
	}

}
