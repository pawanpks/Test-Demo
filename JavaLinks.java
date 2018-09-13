package Web_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaLinks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/PAWAN SINGH/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://WWW.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("java",Keys.ENTER);
	
	List<WebElement> javalinks=driver.findElements(By.xpath("//h3/a"));
	int size=javalinks.size();
	WebElement links;
	for(int i=0;i<=size-1;i++)
	{
		links=javalinks.get(i);
		String linktext=links.getText();
		
		System.out.println("Printing The Java Links : "+linktext);
	
		links.click();
		String title=driver.getTitle();
		System.out.println("Printing The Title of Webpage : "+title);
		driver.navigate().back();
		javalinks=driver.findElements(By.xpath("//h3/a"));	
	}
	driver.quit();
	}
}
