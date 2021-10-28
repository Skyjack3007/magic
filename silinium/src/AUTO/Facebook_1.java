package AUTO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/account/login?ret=%2Fplus-offer-summary%2F2102T50ZEE01");
		
	//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
		
		WebElement UserID =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement Password =driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LogIN = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	
		UserID.sendKeys("pdhairyasheel7787@gmail.com");
		Password.sendKeys("patil102d");
		LogIN.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("Samsung galaxy note 10 Lite");
		WebElement searchtab= driver.findElement(By.xpath("//button[@type='submit']"));
		searchtab.click();
		 Thread.sleep(50000);
		}

}
