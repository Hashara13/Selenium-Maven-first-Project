import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplementElement {

	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
	      
	    WebDriver driverobj = new FirefoxDriver();
//	    driverobj.get("https://www.booking.com/searchresults.en-gb.html?ss=Hatton%2C+Nuwara+Eliya+District%2C+Sri+Lanka&ssne=Bogawantalawa&ssne_untouched=Bogawantalawa&label=en-lk-booking-desktop-IncWB4CtfrbYgbu3xC6gmwS652796017434%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-334108349%3Alp9069428%3Ali%3Adec%3Adm&aid=2311236&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=-2219276&dest_type=city&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=362848aa92e4015f&ac_meta=GhAzNjI4NDhhYTkyZTQwMTVmIAAoATICZW46BmhhdHRvbkAASgBQAA%3D%3D&checkin=2024-02-04&checkout=2024-02-05&group_adults=2&no_rooms=1&group_children=0");

	    driverobj.get("https://www.w3schools.com/howto/howto_js_display_checkbox_text.asp");
	    WebElement b=driverobj.findElement(By.id("myCheck"));
	    // checkweather element available
	    Boolean c=b.isDisplayed();
	    System.out.println(c);
//	    // checkweather element enabled
	    Boolean c2=b.isEnabled();
	    System.out.println(c2);
	 // checkweather ckbox selected
	    Boolean c3=b.isSelected();
	    System.out.println(c3);
	    b.click();	  
	    Boolean c4=b.isSelected();
	    System.out.println(c4);
	}

}
