package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadName = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div)[3]/a")).getText();
		System.out.println("First Lead ID : " + leadName);
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div)[3]/a")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead")) {
			System.out.println("Successfully Verified the Title");
		} else {
			System.out.println("Unable to Verify the Title");
		}
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		String dupText = driver.findElement(By.xpath("//ul[@class='navHistory']//a")).getText();

		if(dupText.contains(leadName)) {
			System.out.println("Successfully Confirmed the Duplicated Name is Captured Name");
		} else {
			System.out.println("Unable to Confirm the Duplicated Name");
		}
		
		driver.close();
	}

}
