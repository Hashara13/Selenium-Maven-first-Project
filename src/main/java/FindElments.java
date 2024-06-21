import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElments {
int i=0;
	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
      
WebDriver driverobj = new FirefoxDriver();
driverobj.get("https://www.google.com/");

// findelement and give element count
//List<WebElement> a=driverobj.findElements(By.linkText("Gmail"));
List<WebElement> b=driverobj.findElements(By.tagName("a"));
int siozeb=b.size();
System.out.println(siozeb);
for(int i=1;i<siozeb;i++) {
	WebElement a=b.get(i);
	String  c=a.getText();
	// print links 
	System.out.println(c);
	
}


	}

}
