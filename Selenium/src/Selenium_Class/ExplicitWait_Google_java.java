package Selenium_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Google_java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/PAWAN SINGH/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.id("lst-ib"));
	searchBox.sendKeys("java",Keys.ENTER);
	driver.findElement(By.linkText("Download Free Java Software")).click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.titleIs("Download Free Java Software"));
	String title = driver.getTitle();
	System.out.println(title );
}
}
