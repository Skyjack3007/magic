package icici;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class part_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // Method of call web driver
		driver.get("https://www.google.co.in/");  //use to launch the application
		Thread.sleep(3000);
		driver.navigate().to("https://www.icicibank.com/");
	//	Thread.sleep(3000);
	//	driver.navigate().back();
	//	Thread.sleep(3000);
	//	driver.navigate().forward();
	//	Thread.sleep(3000);
	//	driver.navigate().refresh();
	//	Thread.sleep(3000);
	//	driver.navigate().to("http://www.samsung.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement later =driver.findElement(By.xpath("(//div[@id='push-modal-close']"));
//		WebElement newuser =driver.findElement(By.xpath("((//a[@class='ic-btn white'])[2]"));
		
		
		
//		WebElement Password =driver.findElement(By.xpath("//input[@type='password']"));
//		WebElement LogIN = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		later.click();
//		newuser.click();
		

	}

}
