package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class part_01 
{
	 

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		// Implicit wait [ Waiting time Only]
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
		
		//Explicit Wait [ Waiting time + Condition ]
//		WebDriverWait wait = new WebDriverWait(driver,20); //only seconds
//		WebElement cc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("URL")));
		
		
		
		
		driver.navigate().to("URL");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().equals(driver);
//		driver.navigate().refresh();
		
		driver.getCurrentUrl();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		driver.getTitle();
//		String title = driver.getTitle();
		
		driver.manage().window().maximize();   //to maximize the Window
		
		WebElement userid = driver.findElement(By.xpath("//input[@name='email']"));
		userid.sendKeys("pdhairyasheel7787@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("9890203388");
		
		WebElement loginin = driver.findElement(By.xpath("//button[@name='login']"));
		loginin.click();
		
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		
		 Date d = new Date();
		    String facebook = d.toString().replace(":", "_").replace(" ", "_")+"png";
		    File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    File dest = new File("C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\s\\facebook.png");
			FileHandler.copy(source, dest);
		
			
			String path = "C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\Study.xlsx";
			
			FileInputStream file = new FileInputStream(path);
			
//			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
//			System.out.println(value);
//			
			
			String values = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(1).getStringCellValue();
			System.out.println(values);
			
			
			//POM -->> page object model
			
		

		
		
		
	}
		
}