package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartExample {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		 List<WebElement> allnames = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div"));
		for(int i=0;i<allnames.size();i++)
		{
			String text = allnames.get(i).getText();
			String text1 = allprice.get(i).getText();
			System.out.println(text+"--->"+text1);
		}
		driver.close();
	}

}
