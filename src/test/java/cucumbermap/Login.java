package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class Login
{
	
	@When ("^user open \"(.*)\" browser with exe \"(.*)\"$")
	   public void bLaunch(String bname,String exe)
	   {
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
	    SeleniumOperation.browserLaunch(input);	
	   }
	
	
	@When ("^user open url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
	SeleniumOperation.openApplication(input1);	
	}
	
	
	@When ("^user cancle initial Login window$")
	  public void cancleLoginW()
	  {
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickOnElement(input2);	
	  }
	
	@When ("^user navigate on Login button$")
	public void navigateLogin()
	{
		 Object[] input3=new Object[1];
		 input3[0]="//*[text()='Login']";
		 SeleniumOperation.moveToElement(input3);; 
		
	}
	
	@When ("^user click on MyProfile$")
	public void MyP()
	{
		 Object[] input4=new Object[1];
		 input4[0]="//*[text()='My Profile']";
		 SeleniumOperation.clickOnElement(input4);
	}
	@When ("^user enter \"(.*)\" as username$")
	public void uname(String uName) throws InterruptedException
	{
		Thread.sleep(5000);
		Object[] input5=new Object[2];
		 input5[0]="(//*[@type='text'])[2]";
		 input5[1]=uName;
		 SeleniumOperation.sendKeys(input5);
	}
	@When ("^user enter \"(.*)\" as password$")
	public void pass(String passwd)
	{
		Object[] input6=new Object[2];
		 input6[0]="//*[@type='password']";
		 input6[1]=passwd;
		 SeleniumOperation.sendKeys(input6);
	}
	@When ("^user click on Login button$")
	public void loginB()
	{
		 Object[] input7=new Object[1];
		 input7[0]="(//*[@type='submit'])[2]";
		 SeleniumOperation.clickOnElement(input7);
	}
	
	@Then ("^Application shows user profile to user$")
	  public void valid() throws InterruptedException
	  {
		Thread.sleep(5000);
		Object[] input8=new Object[2];
		 input8[0]="//*[@class='_1ruvv2']";
		 input8[1]="GanesH Gandal";
		 SeleniumOperation.validation(input8);
	  }
	
	
	@Then ("^Application shows appropriate error message$")
	public void inValid() throws InterruptedException
	  {
		Thread.sleep(5000);
		Object[] input9=new Object[2];
		 input9[0]="(//*[text()='Login'])[2]";
		 input9[1]="Login";
		 SeleniumOperation.validationForInvalid(input9);
	  }
	
	@Then ("^browser close$")
	public void bClose() throws InterruptedException
	{
		Thread.sleep(5000);
		SeleniumOperation.browserClose();
	}

}


