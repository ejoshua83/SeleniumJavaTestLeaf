package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAdvanced {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement eleDropDown1 = driver.findElement(By.id("dropdown1"));
		Select dropDownVal = new Select(eleDropDown1);
		
		List<WebElement> totalVal = dropDownVal.getOptions();
		System.out.println(totalVal.size());
		for (WebElement eleVal : totalVal) {
			System.out.println(eleVal.getText());		
		}	
		
	}

}
