package Selenium_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Location_Of_ID_Pass_Box {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/PAWAN SINGH/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement passBox = driver.findElement(By.id("pass"));	//inspect FB Password box
	Point passLocation = passBox.getLocation();	//creating the getLocation Interface and casting in point class and creating the reference variable
	int passx = passLocation.getX(); //getX is returning the int type Location of Box and we are storing it in reference.
	int passy = passLocation.getY();
	System.out.println(passx);
	System.out.println(passy);
}
}
