package YouTube;
                                         //YouTube
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class part_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Velocity Class\\Softwere\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Ekadantaya Vakratundaya Shankar Mahadevan SREEJITHKUMAR G MUSIC WORLD SKG ENTERTAINMENT YouTube");
		
		WebElement tab =driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		tab.click();
		
		Thread.sleep(5000);
		WebElement play = driver.findElement(By.xpath("//a[@id='video-title']"));
		play.click();
		
	//	Thread.sleep(5000);

	}

}
