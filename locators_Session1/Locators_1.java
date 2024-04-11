package locators_Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		
		//Locating web element using linkText
		driver.findElement(By.linkText("Lifetime Access")).click();
		driver.manage().window().maximize();
		////Locating web element using partiallinkText
		driver.findElement(By.partialLinkText("Prac")).click();
		
		//Locating web element using id
		//driver.findElement(By.id("email")).sendKeys("SurajPatil2111998@gmail.com");
		
		//OR 
		//Once you locate an web element, you can store it in one variable with the type as "WebElement".
//		WebElement emailbox = driver.findElement(By.id("email"));
//		emailbox.sendKeys("SurajPatil2111998@gmail.com");
		
		//Locating web element using name
//		driver.findElement(By.name("password")).sendKeys("Suraj@1998");
//		driver.findElement(By.id("icon-e")).click();

		//to maximize & minimize the window
		
		//driver.manage().window().minimize();
		
		//driver.findElement(By.linkText("Sign Up")).click();
		
		
	}

}
