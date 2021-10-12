package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Edwin");
		driver.findElement(By.id("lastNameField")).sendKeys("TestLeaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Edwin");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("TestLeaf");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement eleState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateVal = new Select(eleState);
		stateVal.selectByVisibleText("New Jersey");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Edited");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Title of the Page is: " +driver.getTitle());
		
		driver.close();
	}

}
