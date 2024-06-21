import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestKeys {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
	      
		 WebDriver driverobj = new FirefoxDriver();
		 driverobj.get("https://www.google.com/?gws_rd=ssl");
		 WebElement b=driverobj.findElement(By.id("APjFqb"));
		 b.sendKeys("Colombo");
		 b.sendKeys(Keys.BACK_SPACE);
		 
		 b.sendKeys(Keys.CONTROL+"a");
		 b.sendKeys(Keys.CONTROL+"c");
		 b.sendKeys(Keys.ENTER);
		 
	}

}
