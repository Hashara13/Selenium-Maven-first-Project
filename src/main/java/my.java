import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class my {
	 public static void main(String[] args) {
	        // Set the path to geckodriver
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
//	        
	        // Initialize the FirefoxDriver
  WebDriver driver = new FirefoxDriver();
//	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.youtube.com/");
	        
//	        // Open a website to test
//	        
//	        
//	        // Close the driver
//	        driver.quit();
	    }
}
