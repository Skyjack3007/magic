package phptravels;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class phptravels_01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhairyasheel\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		//driver.navigate().forward();
		Thread.sleep(3000);
		//** getCurrentUrl();
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		//** getTitle();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.manage().window().maximize();
//		
//		//**part of xpaths 
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='theme-btn theme-btn-small waves-effect']"));  // by using attributes
		signup.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Dhairyasheel");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Patil");
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9404909102");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("pdhairyasheel7787@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("p@til102D");
//		
//		//** Methods of the Web Elements (Functions)
//		// 1. click();
//		// 2. sendkeys();
//		// 3. isSelected();
//		// 4. isDisplayed();
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='password']"));
		boolean result = checkbox.isDisplayed();
	    if(result)
	    	{
	    		System.out.println("It is present on Screen");
	    	}
	    else
	    	{
	    	System.out.println("It is not present on Screen");
	    	}
	    
//	    // 5. isEnabled();
	    
	    WebElement enabled = driver.findElement(By.xpath("//input[@name='last_name']"));
	    boolean results = enabled.isEnabled();
	    if(results)
	    	{
	    		System.out.println("element is enabled");
	    	}
	    else
	    	{
	    		System.out.println("element is desibled");
	    	}
	    
//	    // 6. getText();
	    
	    WebElement loin = driver.findElement(By.xpath("//input[@name='email']"));
	    String text = loin.getText();
	    if(text.equals("expected text"))
	    	{
	    		System.out.println("expected text");
	    	}
	    else
	    	{
	    		System.out.println("text is wrong");
	    	}
	    
//	    // 7. getAttributes
	   
	    WebElement button = driver.findElement(By.xpath("//input[@name='email']"));
	    String attributevalue = button.getAttribute("placeholder");
	    if(attributevalue.equals("Email"))
	    	{
	    		System.out.println("text is verified");
	    	}
	    else
	    	{
	    		System.out.println("text is wrong");
	    	}	
	    
//	    // ** How to handle the dropdown in listbox
//	    // 1. selectByIndex();
//	    // 2. selectByValue();
//	    // 3. selectByVisibleText(" ");
//	    
//	 // 3. selectByIndex();
	    
	    WebElement Customer = driver.findElement(By.xpath("//select[@id='account_type']"));
	    Select s =new Select(Customer);
	    s.selectByVisibleText("Supplier");
    
	    Thread.sleep(10000);
//	    
//	  //** Screenshot
//	    //How to take scroonshot in silinium
	    Date d = new Date();
	    String image001 = d.toString().replace(":", "_").replace(" ", "_")+"png";
	    File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\s\\image001.png");
		FileHandler.copy(source, dest);
	    Thread.sleep(5000);
//	** Mouse Function
//		//How to perform the mouse action in silinium
		
		Actions act = new Actions(driver);
	
		WebElement hotel = driver.findElement(By.xpath("(//a[@class=' waves-effect'])[5]"));
		act.moveToElement(hotel).click().build().perform();	
//		act.moveToElement(hotel).contextClick().build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
	//  how to drag and drop operation 	
		WebElement sources = driver.findElement(By.xpath("//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='drop-box ui-droppable']"));
		act.dragAndDrop(sources, target).build().perform();
		
	// How to Scroll UP and Scroll Down in the application
		
	//	driver.get("https://www.phptravels.net/");
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,500)");
		
		driver.get("https://www.phptravels.net/");
		
	//	WebElement ele = driver.findElement(By.xpath("//div[@class='text-center']"));		
	//	JavascriptExecutor jss = (JavascriptExecutor)driver;
	//	jss.executeAsyncScript("argument[0].scrollIntoView(true);ele");
		

			
		
	}  
}