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
	public void dashboard_site() {
		ChromeDriverManager.chromedriver().setup();
		WebDriver browser = new ChromeDriver();

		browser.get("https://dashboard.magicfix.in/");
		browser.manage().window().maximize();

		browser.findElement(By.xpath("//input[@id=\"login_userName\"]")).sendKeys("medari@gmail.com");
		browser.findElement(By.xpath("//input[@id='login_password']")).sendKeys("medari");
		browser.findElement(By.xpath("//span[text()='Log in']//ancestor::button")).click();
		
		//WebElement href = browser.findElement(By.xpath("//img[@src=\"/static/media/aha_logo.a4f3c4c1.png\"]"));
		//assertTrue((href.isDisplayed()));
		//div[@class="coming-soon-content"]
		browser.close();
	}
	
}
