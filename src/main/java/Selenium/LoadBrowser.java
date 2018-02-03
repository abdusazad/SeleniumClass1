package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadBrowser {

	//public static void main(String[] args) throws InterruptedException {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beauty1\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("yahoo login");
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			driver.findElement(By.xpath("//*[contains(text(),'yahoo login')]")).click();
			
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
			
			//Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div/h3/a)[1]")).click();
			
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("abdus_azad@yahoo.com");
			driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("abcd@yahoo.com");
			
			//Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@value='Next']")).click();
			
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath(".//*[@id='login-passwd']")).sendKeys("Nafiahnaf1ya");
			
			driver.findElement(By.xpath(".//*[@id='login-passwd']")).sendKeys("abcd1234");
			
			//Thread.sleep(3000);
			
			//driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.get("https://www.gmail.com/");
	}

}
