package POM;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy (xpath = "//input[@name='email']")
	private WebElement username;
	
	
	@FindBy (xpath = "//input[@name='pass']")
	private WebElement Password;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement login;
	
	public loginpage(WebDriver driver) {   //global variable of same class
		PageFactory.initElements(driver, this);
		
	}
	public void sendusername()
	{
		username.sendKeys("pdhairyasheel7787@gmail.com");
		
	}
	public void sendpassword()
	{
		Password.sendKeys("9890203388");
		
	}
	public void sendlogin()
	{
		login.click();;
		
	}
	
	
	public void loginpage()
	{
		username.sendKeys("pdhairyasheel7787@gmail.com");
		Password.sendKeys("9890203388");
		login.click();
	}
}
