package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButtonAssignment {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
		
		driver.findElement(By.xpath("//h5[text()='Button']/following-sibling::img")).click();
		
		System.out.println("X & Y position of the button is: " +driver.findElement(By.id("position")).getLocation());
		
		System.out.println("Color of the Button is: " +driver.findElement(By.id("color")).getCssValue("background-color"));
		
		System.out.println("Height & Width of the Button is: " +driver.findElement(By.id("size")).getSize());
		
		driver.close();
		
	}

}
