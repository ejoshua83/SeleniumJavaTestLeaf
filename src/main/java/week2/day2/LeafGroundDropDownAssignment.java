package week2.day2;

import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDownAssignment {


	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement eleDrop1 = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select(eleDrop1);
		dd1.selectByIndex(1);
		
		WebElement eleDrop2 = driver.findElement(By.name("dropdown2"));
		Select dd2 = new Select(eleDrop2);
		dd2.selectByVisibleText("Appium");
		
		WebElement eleDrop3 = driver.findElement(By.id("dropdown3"));
		Select dd3 = new Select(eleDrop3);
		dd3.selectByValue("3");
		
		WebElement eleDrop4 = driver.findElement(By.xpath("//div[@class='example'][4]/select"));
		Select dd4 = new Select(eleDrop4);
		List<WebElement> optVal = dd4.getOptions();
		System.out.println("Total Number of Values: "+optVal.size());
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Loadrunner");
		
		WebElement eleDrop5 = driver.findElement(By.xpath("//option[text()='Select your programs']/.."));
		Select dd5 = new Select(eleDrop5);
		dd5.selectByVisibleText("Selenium");
		dd5.selectByVisibleText("Appium");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
