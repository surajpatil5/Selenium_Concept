package locators_Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Lifetime Access")).click();
		
		//Locating multiple elements using classname 
	    int	size = driver.findElements(By.className("testimonial-block")).size();
	    System.out.println(size);
	    
	    //Requirement is to find no.of links on the web page
	  //Locating multiple elements using Tagname 
	    int	linkcount = driver.findElements(By.tagName("a")).size();
	    System.out.println(linkcount);
	    
	    //CSS -> Tag & ID
//	    driver.findElement(By.cssSelector("#email")).sendKeys("SurajPatil2111998@gmail.com");	
//	    //OR
//		driver.findElement(By.cssSelector("input#email")).sendKeys("SurajPatil2111998@gmail.com");

		
		 //CSS -> Tag & ID
//	    driver.findElement(By.cssSelector(".form-input")).sendKeys("SurajPatil2111998@gmail.com");	
//	    //OR
//		driver.findElement(By.cssSelector("input.form-input")).sendKeys("SurajPatil2111998@gmail.com");

		//CSS -> Tag & any attributes
//	    driver.findElement(By.cssSelector("[autocomplete=email]")).sendKeys("SurajPatil2111998@gmail.com");	
//	    //OR
//	    driver.findElement(By.cssSelector("input[autocomplete=email]")).sendKeys("SurajPatil2111998@gmail.com");
	
	    
	  //CSS -> Tag, class & any attributes
//	  driver.findElement(By.cssSelector("input.inputtext[placeholder=\"Email address or phone number\"]")).sendKeys("8425986597");
//	  driver.findElement(By.cssSelector("input.inputtext[placeholder=\"Password\"]")).sendKeys("ABCDEFGH");
	   //OR
	  driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_email\"]")).sendKeys("8425986597");
	  driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_pass\"]")).sendKeys("ABCDEFGH");
	 
	 
		
	}

}
