package learning;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;

import io.github.sukgu.Shadow;


public class EditLegalEntity {


	@Test
	public void b() throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		driver.manage().window().maximize();

		//Step 1: Login to Login | Salesforce 
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);


		//Click on learnmore under mobile publisher
		driver.findElement(By.xpath("//span[text()='Mobile Publisher']/following::button[1]")).click();
		Thread.sleep(3000);

		Object[] windowHandles=driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
		Thread.sleep(2000);

		//Click on confirm button
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Accept All Cookies' and @id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(2000);
		
		
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(1500);
		
	
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//span[text()='Learning on Trailhead']")));
//		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		WebElement learningOnTrailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		actions.moveToElement(learningOnTrailhead).perform();
		Thread.sleep(2000);

		// Click on  Salesforce Certification
		WebElement salesCertification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		salesCertification.click();

		
		// click saleforce architect option
		driver.findElement(By.xpath("//a[contains(@href,'architectoverview')]")).click();
		Thread.sleep(2000);
		
		// click learn more
		WebElement learnmore = driver.findElement(By.xpath("//a[contains(text(),'Technical Architect')]/preceding::a[1]"));
		
		((JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"nearest\"});", learnmore);
		Thread.sleep(2000);
		
		learnmore.click();
		Thread.sleep(2000);
		
		Object[] windowHandles1=driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles1[2]);
		Thread.sleep(2000);
		
	}



}
