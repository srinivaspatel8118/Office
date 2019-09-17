package webtables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElements {

public static void main(String[] args) {
	
	String dir=System.getProperty("user.dir");
	String driverPath = dir+"\\driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath); 
	WebDriver driver=new ChromeDriver();  
	driver.manage().window().maximize();  
	driver.get("http://google.com");
}

}
