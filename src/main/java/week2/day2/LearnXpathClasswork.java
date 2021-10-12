package week2.day2;

import java.time.Duration;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpathClasswork {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement enterName = driver.findElement(By.xpath("//input[@id='username']"));
		enterName.sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		loginButton.click();

		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Edwin");		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TestLeaf");		
		

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
