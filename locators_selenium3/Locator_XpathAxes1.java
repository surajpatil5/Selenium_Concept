package locators_selenium3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XpathAxes1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Relative xpath + axes 'self'  ---> Select the current node
		String txt = driver.findElement(By.xpath("//a[contains(text(), 'Salzer')]/self::a")).getText();
		System.out.println(txt);   //Salzer Electr.
		
		//Relative xpath + axes 'parent'   ---> Select the parent of the current node (always one)
		String B = driver.findElement(By.xpath("//a[contains(text(),'AVG')]/parent::td")).getText();
		System.out.println(B);   //AVG Logistics
		
		
		//Relative xpath + axes 'child'  ---> Select all the child of the current node 
		//to find child of self/any element-> you can use '*'
		//driver.findElement(By.xpath("a[contains(text(), 'Winsome Textile')]/child::*"));
		//to get multiple elements -> always use "findElements"
		List<WebElement> Lst = driver.findElements(By.xpath("//a[contains(text(), 'Winsome Textile')]/ancestor::tr/child::td"));
		System.out.println("The size of elements present in td "+ Lst.size());  //The size of elements present in td 5
		
		//Relative xpath + axes 'ancestor' ---> Select all the ancestors of the current node (GrandParent & Parent)
		txt = driver.findElement(By.xpath("//a[contains(text(),'Kalyan Cap')]/ancestor::tr")).getText();
		System.out.println("Retriving complete data: "+ txt);  //Retriving complete data: Kalyan Capitals X 22.57 25.03 + 10.90
		
		//Relative xpath + axes 'descendant' ---> Select all the descendants (Children, GrandChildren etc...) of current node
		List <WebElement> Desc =driver.findElements(By.xpath("//a[contains(text(), 'Virat')]/ancestor::tr/descendant::td"));
		System.out.println("Total Size of descendants elements is: "+ Desc.size());  //Total Size of descendants elements is: 7
				
		//Relative xpath + axes 'following' --->
		List<WebElement> fllowingnode = driver.findElements(By.xpath("//a[contains(text(),'Virat')]/ancestor::tr/following::tr"));
		System.out.println("The number of following nodes are: "+fllowingnode.size()); //The number of following nodes are: 1633
		
		//Relative xpath + axes 'following-sibling' --->
		List<WebElement> fllowingsiblingnode = driver.findElements(By.xpath("//a[contains(text(),'Virat')]/ancestor::tr/following-sibling::tr"));
		System.out.println("The number of following-sibling nodes are: "+fllowingsiblingnode.size());
		//The number of following-sibling nodes are: 1631
		
		//Relative xpath + axes 'Preceding' --->
		List<WebElement> preced = driver.findElements(By.xpath("//a[contains(text(),'Emmessar')]/ancestor::tr/preceding::tr"));
		System.out.println("The number of preceding nodes are: "+preced.size()); //The number of preceding nodes are: 5
		
		//Relative xpath + axes 'Preceding-sibling' --->
		List<WebElement> preced_sibling = driver.findElements(By.xpath("//a[contains(text(),'Emmessar')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("The number of preceding-sibling nodes are: "+ preced_sibling.size()); //The number of preceding-sibling nodes are: 4

		driver.close();
	}

}
