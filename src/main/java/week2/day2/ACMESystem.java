package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystem {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("leaf@12");
			
		driver.findElement(By.xpath("(//button[contains(text(), Login)])[2]")).click();

		String title = driver.getTitle();
		System.out.println("Title of the Page is: " + title);
		
		driver.findElement(By.xpath("//form[@id='logout-form']/following-sibling::li/a")).click();
		
		driver.close();
		
		
	}

}
