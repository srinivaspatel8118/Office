package dataproviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginCirculus {

	WebDriver driver;
	@Test
	public void login()
	{
		String exePath = System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
		driver.findElement(By.id("TxtEmail")).sendKeys("spatel@xtglobal.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@1234");
		driver.findElement(By.id("BtnLogin")).click();
	}
}
