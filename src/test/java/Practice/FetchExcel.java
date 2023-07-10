package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchExcel {

	public static void main(String[] args) throws Throwable {
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
		Screen scr = new Screen();
		Pattern minBar = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\minimizeBar.png");
		scr.click(minBar);
		
		Pattern srchBar = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\SearchBar.png");
		scr.type(srchBar, "Excel");
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	
		Pattern ExlSheet = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\ExcelSheet.png");
		scr.click(ExlSheet);
		
		Pattern ExlPop = new Pattern("C:\\Users\\Dell\\eclipse-workspace\\Sikuli\\ExcelTxtBox.png");
		scr.type(ExlPop,"RadheKrishna");
		
		
		
		
		
		
	}
}
