package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Edwin");
		driver.findElement(By.name("UserLastName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
		
		WebElement eleTitle = driver.findElement(By.name("UserTitle"));
		Select titleVal = new Select(eleTitle);
		titleVal.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement eleEmp = driver.findElement(By.name("CompanyEmployees"));
		Select empVal = new Select(eleEmp);
		empVal.selectByIndex(3);
		
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");
		driver.findElement(By.name("CompanyCountry")).sendKeys("Canada");
		
		driver.findElement(By.name("CompanyState")).sendKeys("Nova Scotia");
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
	
	}

}
