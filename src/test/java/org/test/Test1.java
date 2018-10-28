package org.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	@Test
	public void SanityTest1() {
				System.setProperty("webdriver.gecko.driver","C:\\GeckoDriverOld\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.seleniumhq.org");
				driver.manage().window().maximize();
				driver.quit();
	}
	
}
