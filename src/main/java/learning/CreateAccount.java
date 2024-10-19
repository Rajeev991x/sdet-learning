package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CreateAccount {

	
	@Test
	public void createAccount() throws InterruptedException
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

		//Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//button[@title='App Launcher']/div[1]")).click();
		Thread.sleep(5000);

		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);Thread.sleep(2000);
		
		//Click on Accounts tab 
		// driver.findElement(By.xpath("//a[@title='Accounts']")).click();
		WebElement eleAccounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", eleAccounts);

		//Click on New button
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);

		//Enter 'your name' as account name
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input[1]")).sendKeys("Rajeev");
		Thread.sleep(2000);

		//Select Ownership as Public                                       
		driver.findElement(By.xpath("//label[text()='Ownership']/following::button[1]")).click();
		Thread.sleep(2000);
		
		//Click save and verify Account name 
		driver.findElement(By.xpath("//label[text()='Description']/following::button[text()='Save']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]")).getText();
		System.out.println(text);
		
		}
	
	
	
}
