package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {
	
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
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Edwin");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div/a")).click();
		
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Successfully Verified the Title");
		} else {
			System.out.println("Unable to Verify the Title");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("LeafTest");
		
		driver.findElement(By.name("submitButton")).click();
		
		String updText = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if(updText.contains("LeafTest")) {
			System.out.println("Successfully Confirmed the Updated Name");
		} else {
			System.out.println("Unable to Confirm the Updated Name");
		}
		
		driver.close();
	}

}
