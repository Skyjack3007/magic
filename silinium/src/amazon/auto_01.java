package amazon;
                                  //Amazon.in
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // Method of call webdriver
		driver.get("https://www.google.co.in/");  //use to launch the application
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	//	Thread.sleep(3000);
	//	driver.navigate().back();
	//	Thread.sleep(3000);
	//	driver.navigate().forward();
	//	Thread.sleep(3000);
	//	driver.navigate().refresh();
	//	Thread.sleep(3000);
	//	driver.navigate().to("http://www.samsung.com");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement UserID =driver.findElement(By.xpath("//input[@id='ap_email']"));
	//	WebElement Password =driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		WebElement LogIN = driver.findElement(By.xpath("//input[@id='continue']"));
		
		UserID.sendKeys("9404909102");
		LogIN.click();
		
		Thread.sleep(5000);
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='ap_password']"));
		WebElement SignIN = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		
		
	//	UserID.sendKeys("9404909102");
	//	Password.sendKeys("patil102d");
	//	LogIN.click();
		Password.sendKeys("p@til102D");
		SignIN.click();
		
		Thread.sleep(5000);

	}

}
