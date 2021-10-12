package week2.day2;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinkAssignment {


	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/Link.html");

		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.findElement(By.xpath("//h5[text()='HyperLink']/following-sibling::img")).click();

		System.out.println("URL without clicking the link: " 
				+driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		String linkUrl = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		URL url = new URL(linkUrl);

		//Creating url connection and getting the response code
		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		httpURLConnect.setConnectTimeout(5000);
		httpURLConnect.connect();
		if(httpURLConnect.getResponseCode()>=400)
		{
			System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
		}  

		driver.findElement(By.xpath("(//a[contains(text(), 'Go')])[2]")).click();
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']/following-sibling::img")).click();
		
		//Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// This line will print the number of links and the count of links.
		System.out.println("No of links are: "+ links.size());  

		driver.close();

	}

}
