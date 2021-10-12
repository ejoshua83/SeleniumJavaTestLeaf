package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment {
	
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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadID = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).getText();
		System.out.println("First Lead ID : " + leadID);
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		String errorMsg = driver.findElement(By.xpath("//div[contains(text(),'No')]")).getText();
		if(errorMsg.equals("No records to display")) {
			System.out.println("Successfully Verified the Error Message");
		} else {
			System.out.println("Unable to Verify the Error Message");
		}
		
		driver.close();
	}

}
