package week2.day2;

import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckboxAssignment {


	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/checkbox.html");

		driver.findElement(By.xpath("//label[contains(text(),'Select')]/following::input")).click();
		
		driver.findElement(By.xpath("(//label[contains(text(),'Select')]/following::input)[2]")).click();
		
		boolean selected = driver.findElement(By.xpath("//label[contains(text(),'Confirm')]/following::input")).isSelected();
		if(selected) {
			System.out.println("Selenium is selected");
		} else {
			System.out.println("Selenium is not selected");
		}
		
		driver.findElement(By.xpath("(//label[contains(text(),'DeSelect')]/following::input)[2]")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Select all')]/following::input")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Select all')]/following::input)[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Select all')]/following::input)[3]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Select all')]/following::input)[4]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Select all')]/following::input)[5]")).click();
		
//		driver.close();
	}

}
