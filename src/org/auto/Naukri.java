package org.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Photon\\AutoIT\\Chromed\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("drama13devi@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("16Jan13*01");
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[text()='GOT IT'])[1]")).click();
		
		Thread.sleep(4000);
		
		WebElement upload = driver.findElement(By.xpath("//div[@class='attachCV']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView('true')",	 upload);
		
		Thread.sleep(4000);
		
		
         driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
         
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:\\Eclipse Photon\\AutoIt.exe");
		
		System.out.println("hai rama");
		
		
		
		
	}

}
