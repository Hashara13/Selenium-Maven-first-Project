import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinked {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");

WebDriver driverobj = new FirefoxDriver();
driverobj.get("https://hashara13.github.io/Hashara-Nethmin-Portfolio-Website/");

//get specific element by Linked
driverobj.findElement(By.linkText("https://www.linkedin.com/in/hashara-nethmin-084925213")).click();

	}

}
