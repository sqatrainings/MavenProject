package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Waits {

	public static void main(String[] args) {
		
		
		  
		  FirefoxDriver driver=new FirefoxDriver ();
		 

		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "D:\\Trainings\\Selenium\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe"
		 * ); WebDriver driver = new EdgeDriver();
		 */
		     driver.get("https://www.gmail.com");
		    //maximize the browser window		
		    driver.manage().window().maximize();
		    
		    // Step 2 set implicit wait
		   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		 
		    // Step 3 Explicit wait 
		    
		    WebDriverWait wait=new WebDriverWait(driver, 20);
		    
		    // Step 4
		    
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId"))).sendKeys("testaarchitect01@gmail.com");
		    
		    //WebElement Email=driver.findElement(By.id("identifierId"));
			//Email.sendKeys("imran.swe2@gmail.com");
			
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		    
			WebElement nextBtn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]"));
			nextBtn.click();
			
			// Step 1
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			// Step 5
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Zeeshan12345");
			
			//WebElement password=driver.findElement(By.name("password"));
			//password.sendKeys("imran12345");
			
			WebElement submitBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			submitBtn.click();

	}

}