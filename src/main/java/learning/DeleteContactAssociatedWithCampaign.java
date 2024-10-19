package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteContactAssociatedWithCampaign {

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
		WebElement contacts = driver.findElement(By.xpath("//a[@title='Contacts']/following::a[1]"));
		driver.executeScript("arguments[0].click();", contacts);
		Thread.sleep(2000);
		
		// Click on delete
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		Thread.sleep(5000);
		
		
		//Confirm delete
		WebElement confirmDelete= driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete this contact?')]/following::span[text()='Delete']"));
		confirmDelete.click();
		Thread.sleep(2000);
		
		  
//			WebElement viewAllKeyDetails =driver.findElement(By.xpath("//span[contains(text(),'View All Key Deals')]"));
//		  
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"nearest\"});", viewAllKeyDetails);
//			Thread.sleep(2000);
//			
//			viewAllKeyDetails.click();
//			Thread.sleep(2000);
//			
//			
//			driver.findElement(By.xpath("//a[@title='New']")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("SRM Steels");
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//span[contains(text(),'Type')]/following::button[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[contains(@title,'New Customer')]")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//span[contains(text(),'Lead Source')]/following::button[1]")).click();
//			Thread.sleep(2000);
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
//				//click save and verify Account name
//			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
//		  Thread.sleep(2000); String text =
//		  driver.findElement(By.xpath("//div[contains(@id,'SRM Steels')]")).
//		  getText(); System.out.println(text);
		  
		 
	}

}
