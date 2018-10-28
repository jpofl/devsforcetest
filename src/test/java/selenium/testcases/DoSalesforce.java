package selenium.testcases;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import selenium.SeleniumTestWrapper;
import selenium.pageobjects.HeaderSearch;
import selenium.pageobjects.SearchResultPage;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS })
public class DoSalesforce extends SeleniumTestWrapper {

	@Before
	public void setup() {
		
	}

	@Test
	public void verifyCreateLead() {
		
		WebDriver driver = getDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("jpofl2@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("1qaz2wsx");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("name_lastlea2")).click();
		driver.findElement(By.id("name_lastlea2")).clear();
		driver.findElement(By.id("name_lastlea2")).sendKeys("Skywalker");
		driver.findElement(By.id("lea3")).clear();
		driver.findElement(By.id("lea3")).sendKeys("Jedi");
		driver.findElement(By.name("save")).click();
	}
}
