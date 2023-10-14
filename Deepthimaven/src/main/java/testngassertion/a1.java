package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class a1 {
	
	/*
	 *assertion : technique where we will be comparing actual result with obtained result
	 *
	 * soft asserts
	 *          provided by softassert builtin class
	 *          nonstatic in nature
	 *          assertion => fail-> it will proceed further
	 *          know the actual result=> invoke assertAll
	 *          
	 * hard asserts
	 *          provided by assert builtin class
	 *          static in nature
	 *          assertion fail=> it will not proceed further 
	 *      
	 * assertEqual(actual ,expected)
	 * assertNotEqual(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)     * 
	 * */
	
	@Test
	public void ha()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
