package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		WebElement account= driver.findElement(By.xpath("//a[@class='_97w5']"));
		account.click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		
		s.selectByIndex(0);
	
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select a = new Select(month);
		a.selectByVisibleText("Dec");

	}

}
