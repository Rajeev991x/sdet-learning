package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContactForCampaign {

	@Test
	public void createAccount() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		driver.manage().window().maximize();

		// Step 1: Login to Login | Salesforce
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);

		// Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//button[@title='App Launcher']/div[1]")).click();
		Thread.sleep(5000);

		// Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		
		//Click on Campaigns tab 
		WebElement campaigns = driver.findElement(By.xpath("//a[@title='Campaigns']/following::a[1]"));
		driver.executeScript("arguments[0].click();", campaigns);
		Thread.sleep(2000);
		
		WebElement bootcamplink = driver.findElement(By.xpath("(//span[contains(text(),'Bootcamp')])[1]"));
		driver.executeScript("arguments[0].click();", bootcamplink);
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		Thread.sleep(2000);
		

		
			driver.findElement(By.xpath("//span[contains(text(),'Salutation')]/following::button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(@title,'MR.')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rajeev");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rajeev");
			Thread.sleep(2000);
			
			
			
			
			
			driver.findElement(By.xpath("//div[@title='Add Contacts']")).click();
			Thread.sleep(2000);
			
			
//			driver.findElement(By.xpath("//span[contains(@title,'Partner Referral')]")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//span[contains(text(),'Stage')]/following::button[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[contains(@title,'Needs Analysis')]")).click();
//			Thread.sleep(2000);
//			
//			
//			driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("20/11/2024");
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//label[contains(text(),'Primary Campaign Source')]/following::input[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[contains(text(),'Primary Campaign Source')]/following::input[1]")).sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[contains(text(),'Primary Campaign Source')]/following::input[1]")).sendKeys(Keys.ENTER);
//
//		  
//		 //click save and verify Account name
//			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
//		  Thread.sleep(2000); String text =
//		  driver.findElement(By.xpath("//div[contains(@id,'SRM Steels')]")).
//		  getText(); System.out.println(text);
//		  
		 
	}

}
