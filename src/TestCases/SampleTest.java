package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

class SampleTest {
	
	@Test
	public void site_header_is_on_home_page()
	{
		/*
		 * FirefoxDriverManager.firefoxdriver().setup(); WebDriver browser = new
		 * FirefoxDriver();
		 */
		ChromeDriverManager.chromedriver().setup();
		WebDriver browser = new ChromeDriver();
		
		browser.get("https://www.gmail.com");
		browser.manage().window().maximize();
		
		browser.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("suchithrakarlapudi");
		browser.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		browser.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		browser.findElement(By.xpath("//input[@name='password']")).sendKeys("Karlapudi@557");
		browser.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		 WebElement href = browser.findElement(By.xpath("//div[@id=':1t']"));
				
		assertTrue((href.isDisplayed()));
		browser.close();
	}
	
}
