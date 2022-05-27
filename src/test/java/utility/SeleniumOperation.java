

package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation 
{
	public static WebDriver driver=null;
	public static void browserlaunch(Object[]inputparameters)
	{
		String bname=(String)inputparameters[0];
		String exe=(String)inputparameters[1];
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.geckodriver.driver", exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
   
	public static void openapp(Object[]inputparameters)
	{
		String URL=(String)inputparameters[0];
		driver.get(URL);
	}
	
	public static void clickOnElement(Object[]inputparameters)
	{
		String Xpath=(String) inputparameters[0];
		driver.findElement(By.xpath(Xpath));
	}
	
	public static void mouseOver(Object[]inputparameters)
	{
		String Xpath=(String)inputparameters[0];
		Actions act= new Actions(driver);
		WebElement web=driver.findElement(By.xpath(Xpath));
		act.moveToElement(web).build().perform();
	}
	public static void sendkey(Object[]inputparameters)
	{
		String Xpath=(String)inputparameters[0];
		String val=(String)inputparameters[1];
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Xpath)).sendKeys(val);
	}
	public static void validation(Object[]inputparameters)
	{
		String XPATH=(String)inputparameters[0];
		String text=(String)inputparameters[1];
		
		String actualText=driver.findElement(By.xpath(XPATH)).getText();
		
		if(actualText.equalsIgnoreCase(text))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		
		}
	}
	public static void validationForInvalid(Object[]inputparameters)
	{
		String XPATH=(String)inputparameters[0];
		String text=(String)inputparameters[1];
		
		String actualText=driver.findElement(By.xpath(XPATH)).getText();
		
		if(actualText.equalsIgnoreCase(text))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		
		}
	}
	public static void browserClose()
	{
		driver.close();
	}
}

