package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;
//pull back to pro
public class prac {

	public static void main(String[] args) throws FindFailed {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Screen scr=new Screen();
	   Pattern googleApps = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\target\\sikuli.png");
	   scr.click(googleApps);
		
	}

}
