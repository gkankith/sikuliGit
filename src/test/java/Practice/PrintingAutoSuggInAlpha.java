package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingAutoSuggInAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver(option);
		driver.get("https://yatra.in/");
		
	}
	

}
