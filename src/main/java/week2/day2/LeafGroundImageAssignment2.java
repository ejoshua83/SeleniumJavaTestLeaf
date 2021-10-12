package week2.day2;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImageAssignment2 {


	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/Image.html");

		driver.findElement(By.xpath("//label[contains(text(),'Click')]/following-sibling::img")).click();

		driver.findElement(By.xpath("//h5[text()='Image']/following-sibling::img")).click();

		String linkUrl = driver.findElement(By.xpath("//label[contains(text(),'Am I')]/following-sibling::img")).getAttribute("src");
		URL url = new URL(linkUrl);

		//Creating url connection and getting the response code
		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		httpURLConnect.setConnectTimeout(5000);
		httpURLConnect.connect();
		if(httpURLConnect.getResponseCode()>=400)
		{
			System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
		}  
		
		driver.findElement(By.xpath("//label[contains(text(), 'Click me')]/following-sibling::img")).click();

        Thread.sleep(2000);
		driver.close();

	}

}
