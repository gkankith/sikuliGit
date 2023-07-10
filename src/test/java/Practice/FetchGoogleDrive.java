package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchGoogleDrive {

	public static void main(String[] args) throws FindFailed {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.cssSelector("svg[focusable='false']")).click();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementsByClassName('fade-in').scrollBottom=300");
		
		/*Screen scr = new Screen();
		Pattern patt = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\drive,png.png");
		scr.click(patt);*/
		
		
		
	}

}
