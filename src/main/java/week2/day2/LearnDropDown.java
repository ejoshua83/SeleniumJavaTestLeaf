package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	
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
		
		// Adding value from the drop down
		// Step 1: locate the select tag
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// eleSource.sendKeys("Conference");   // Can be used for static drop down
		
		// Step 2: Create object for Select
		Select dropDown = new Select(eleSource);
		
		// Step 3.1: Select the drop down value using visible text
		// dropDown.selectByVisibleText("Conference");
		
		// Step 3.2: Select the drop down value using index
		// dropDown.selectByIndex(3);	
		
		// Step 3.3: Select the drop down value using 
		// dropDown.selectByValue("LEAD_OTHER");
		
		// Step 3.4: If the select the tag is not present
		eleSource.click();
		driver.findElement(By.xpath("//option[@value='IND_GEN_SERVICES']")).click();
		
		// Find how many values are present in the drop down
		List<WebElement> totalVal = dropDown.getOptions();
		System.out.println(totalVal.size());
		for (WebElement eleVal : totalVal) {
			System.out.println(eleVal.getText());
		}
		
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
		
//		driver.findElement(By.name("submitButton")).click();
		
	}

}
