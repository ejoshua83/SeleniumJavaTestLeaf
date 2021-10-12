package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	
	public static void main(String[] args) {
		
		// Step 1: To setup the driver[Download the driver & Setup the Path]
		WebDriverManager.chromedriver().setup();
		
		// Step 2: To open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// To maximize browser window
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5000);
		
		driver.get("http://leaftaps.com/opentaps/");
		
		// Another method to open the url
		//driver.navigate().to("http://leaftaps.com/opentaps/");
		
		// To open an edge browser
//		WebDriverManager.edgedriver().setup();
//		
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Close the browser
//		driver.close();
		
		// Enter User name using ID Locator
		WebElement enterName = driver.findElement(By.id("username"));
		enterName.sendKeys("demosalesmanager");
		
		// Enter Password using Name Locator
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		// Enter User name using classname Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		// Click on the CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Edwin");
		
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLeaf");
		
		// Click on Create Lead
		driver.findElement(By.name("submitButton")).click();
		
	}

}
