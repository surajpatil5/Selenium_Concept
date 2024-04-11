package locators_selenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_demo1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		
//	    driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.xpath("//a[contains(text(), 'Create new')]")).click();
//		
//		//Find the sign up button from registration form present in the facebook application. (Child)
//		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).click();
//		
//		//Locate Firstname field from Sign up button in facebook (Parent)
//		driver.findElement(By.xpath("//button[@id='u_2_s_iu']/parent::*/parent::*/child::div[1]/div/div[1]")).sendKeys("Suraj");
//
//		//Identify password from mobile number field in facebook (following)
//		driver.findElement(By.xpath("//input[@id='u_2_g_r5']/following::input[2]")).sendKeys("Suraj");
//		
//		
//		//Locate mobile number from new password field in facebook.
//		driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).sendKeys("Surajpatil");
//		
//		//Locate surname from female radio button in facebook (ancestor)
//		driver.findElement(By.xpath("//input[@id='u_2_4_P1']/ancestor::div[2]/div[1]/div[1]/div[2]")).sendKeys("patil");
//		//OR -> directly put the xpath of surname
//		driver.findElement(By.xpath("//input[@id='u_2_4_P1']/ancestor::div[2]//input[@id='u_2_d_tz']")).sendKeys("patil");
//		
		
		
//		driver.get("https://www.google.com/");
//		
//		//Identify the search text box from google search button present in the google search home page. (Parent)
//		//driver.findElement(By.xpath("//input[@data-ved='0ahUKEwidtsKWpMmEAxUEma8BHSuoA0AQ4dUDCBk']/parent::*/parent::*/parent::*/div[1]/div")).sendKeys("patil");
//	
//		driver.findElement(By.xpath("//textarea[@aria-controls='Alh6id']")).sendKeys("patil");
		
		
		//Identify the 'Customer Service' link from the amazon search text box present in the amazon home page . (Following)
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[@data-csa-c-id='8ztmgn-k5pn63-wk3oas-ed959h']")).click();
	
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone12");
		
		//Identify the Hello, signin from the amazon search box present in the amazon home page . (Following)
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::span[@id='nav-link-accountList-nav-line-1']")).click();
		
		
		//Identifying mobile link which is part of menu bar - Amazon (Descendant)
		//driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[@data-csa-c-slot-id='nav_cs_1']")).click();
		
		
		
		
		
		
	}

}
