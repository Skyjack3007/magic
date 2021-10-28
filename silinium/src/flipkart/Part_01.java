package flipkart;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Part_01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // Method of call webdriver
		driver.get("https://www.google.co.in/");  //use to launch the application
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/account/login?ret=%2Fplus-offer-summary%2F2102T50ZEE01");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("http://www.samsung.com");
		
		driver.manage().window().maximize();             //maximize method
		
		Thread.sleep(5000);
		
		WebElement UserID =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement Password =driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LogIN = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		Thread.sleep(5000);
		
		UserID.sendKeys("pdhairyasheel7787@gmail.com");
		Password.sendKeys("patil102d");
//		LogIN.click();
		
//		Thread.sleep(5000);
//		Date d = new Date();
//		String test003 = d.toString().replace(":", "_").replace(" ", "_")+"png";
		
	
		
//		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	File dest = new File("C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\screenshot\\test003.png");
	//	FileHandler.copy(source, dest);
		
//		FileHandler.copy(source, new File("C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\screenshot\\" +test003));
		
		Actions act = new Actions(driver);
		act.moveToElement(LogIN).click().perform();
		
		Thread.sleep(3000);
		
		WebElement flipkart =driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
		act.moveToElement(flipkart).click().perform();
		

	}

}
