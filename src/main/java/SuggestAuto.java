import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuggestAuto {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
	      
		 WebDriver driverobj = new FirefoxDriver();
		 driverobj.manage().window().maximize();
		 driverobj.get("https://www.google.com/?gws_rd=ssl");
		driverobj.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Colombo");
		 Thread.sleep(3000);
		

	}

}
