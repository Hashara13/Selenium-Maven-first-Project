import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locator {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");

WebDriver driverobj = new FirefoxDriver();
driverobj.get("file:///E:/My/Python/LiveAI%20chatbot/templates/index.html");

//get specific element by Id
driverobj.findElement(By.className("chatbot-toggler")).click();

//driverobj.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwikh9Cj5tyGAxUCzTgGHQw2DegQPAgJ");
////get specific element by Id
//driverobj.findElement(By.id("APjFqb")).sendKeys("Hashara Nethmin");

	}

}
