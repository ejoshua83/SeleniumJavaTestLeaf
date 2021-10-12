package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement enterName = driver.findElement(By.id("username"));
		enterName.sendKeys("demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Edwin");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("17/12/1983");
		
		// Enter Contact Information
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("801");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("747-1234");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Edwin");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@testleaf.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("801");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("801");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("801");
		
		driver.findElement(By.name("submitButton")).click();
		
	}

}
