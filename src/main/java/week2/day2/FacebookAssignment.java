package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Edwin");
		driver.findElement(By.name("lastname")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//div[contains(text(), 'Mobile')]/following-sibling::input")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("Password");
		
		WebElement eleDay = driver.findElement(By.id("day"));
		Select dobDay = new Select(eleDay);
		dobDay.selectByIndex(16);
		
		WebElement eleMonth = driver.findElement(By.id("month"));
		Select dobMonth = new Select(eleMonth);
		dobMonth.selectByValue("12");
		
		driver.findElement(By.id("year")).sendKeys("1990");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();		
	}

}
