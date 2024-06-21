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
  WebDriver driverobj = new FirefoxDriver();
//	        WebDriver driver = new EdgeDriver();
  driverobj.get("https://www.youtube.com/");
  
  // store current url
	        String obj=driverobj.getCurrentUrl();
	        //print
	        System.out.println(obj);
	        String obj2=driverobj.getTitle();
	        System.out.println(obj2);
//	        // Open a website to test
//	        
//	        
//	        // Close the driver
//	        driver.quit();
	    }
}
