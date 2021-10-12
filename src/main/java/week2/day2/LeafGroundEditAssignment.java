package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEditAssignment {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Append')]/following-sibling::input")).sendKeys("Text");
		String defaultText = driver.findElement(By.xpath("//label[contains(text(),'Get')]/following-sibling::input")).getAttribute("value");
		System.out.println("Default Text Value is: " +defaultText);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		WebElement eleField = driver.findElement(By.xpath("//label[contains(text(),'Confirm')]/following-sibling::input"));
		if(eleField.isEnabled()) {
			System.out.println("Successfully confirmed the field is Enabled");
		} else {
			System.out.println("Successfully confirmed the fied is Disabled");
		}
		
		driver.close();
		
	}

}
