package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInpage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	
		//ImplicitWiat classs
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		loginpage LoginPage = new loginpage(driver);
		LoginPage.sendusername();
		LoginPage.sendpassword();
		LoginPage.sendlogin();
	
		System.out.println("OKKKKK");
//		Homepage homepage =new Homepage(driver);
//		homepage.Homepage();

	}

}
