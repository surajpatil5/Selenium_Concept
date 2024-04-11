package locators_Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
	    
	    //Absolute xPath
	    driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("SurajPatil2111998@gmail.com");
	    driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Password123");
	    
	    //Relative Xpath
	    driver.findElement(By.xpath("//input[@type='email']")).clear();
	    driver.findElement(By.xpath("//input[@id='password']")).clear();
	    
	    //Using 'Or' option with Relative Xpath -> Either one relative xpath should be correct or True
	   // driver.findElement(By.xpath("//input[@data-testid='login-button' or @value='Log in']")).click();
	    
	   //Using 'and' option with Relative Xpath -> both relative xpath should be correct or True
	  // driver.findElement(By.xpath("//input[@data-testid='login-button' and @value='Log in']")).click();
	  
	   // driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[3]/a[1]")).click();
	    
	    //contains() method
	   //driver.findElement(By.xpath("//img[contains(@alt,('Rahul Shetty Academy')]")).click();
	  //driver.findElement(By.xpath("//img[contains(@alt,'Shetty')]")).click();
	 
	    //starts-with method
	 //driver.findElement(By.xpath("//img[starts-with(@alt,'Rahul')]")).click();
	  
//	  driver.findElement(By.xpath("//a[text()='View All Products']")).click();
	 
	    //using text() method
	    driver.findElement(By.xpath("//label[text()='Remember Me']")).click();
	    
	    //Chained Xpath -> locating element using multiple xpath 
	    driver.findElement(By.xpath("//div[@class='m-b-4-xs']//input[@name='email']")).sendKeys("ABC@gmail.com");
	    
	    
	    
	    
	}

}
