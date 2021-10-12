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
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundOptionAssignment2 {


	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/radio.html");

		driver.findElement(By.xpath("//div[@id='first']//input")).click();
		
		boolean unchecked = driver.findElement(By.xpath("//label[contains(text(),'Find')]/following::input")).isSelected();
		if(unchecked) {
			System.out.println("Value is Selected");
		} else {
			System.out.println("Value is not Selected");
		}
		
		boolean checked = driver.findElement(By.xpath("(//label[contains(text(),'Find')]/following::input)[2]")).isSelected();
		if(checked) {
			System.out.println("Value is Selected");
		} else {
			System.out.println("Value is not Selected");		
		}
		Thread.sleep(2000);
		
		driver.close();
	}

}
