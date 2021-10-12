package week2.day2;

// import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownClasswork {
	
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
		
		// Select the direct mail from source using visible text
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceVal = new Select(eleSource);
		sourceVal.selectByVisibleText("Direct Mail");
		
		// Select the health care from industry using index
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryVal = new Select(eleIndustry);
		industryVal.selectByIndex(7);
		
		// Select the partnership from ownership using value
		WebElement eleOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerVal = new Select(eleOwner);
		ownerVal.selectByValue("OWN_PARTNERSHIP");
		
		// Select the affliated sites from marketing using send keys
		
//		driver.findElement(By.id("createLeadForm_marketingCampaignId")).click();
//		driver.findElement(By.xpath("//option[@value='9002']")).click();		
//		
//		driver.findElement(By.name("submitButton")).click();
		
	}

}
