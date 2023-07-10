package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BbcExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://bbc.com/");
   int y= driver.findElement(By.xpath("//span[text()='Editor’s Picks']")).getLocation().getY();
   JavascriptExecutor js=(JavascriptExecutor) driver;
   Thread.sleep(1000);
   js.executeScript("window.scrollTo(0,"+y+")");
  List<WebElement> all = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li"));
  for(int i=0;i<all.size();i++)
  {
	  String text = all.get(i).getText();
	  System.out.println(text);
  }
  driver.close();
	}
   
}
