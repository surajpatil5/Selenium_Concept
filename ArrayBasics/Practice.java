package ArrayBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Patil\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Suraj Patil\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suraj Patil\\Downloads\\geckodriver-v0.34.0-win64(1)\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		//Find sum of elements in an array {1,2,3,4,5,6}
		/*
		int a[] = {1,2,3,4,5,6};
		
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			int S= a[i];
			sum =sum + S;
		}
		System.out.println(sum);    //21
		*/
		
		
		//2. Print count of even & odd numbers from array {1,2,3,4,5,6} & also print numbers also
		/*
		int a[] = {1,2,3,4,5,6};
		
		int even =0;
		int odd =0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			int val = a[i];
			if(val%2==0)
			{
				System.out.println("Even num is: "+ val);
				even++;
			}
			else
			{
				System.out.println("Odd num is: "+ val);
				odd++;
			}
			
		}
		System.out.println("Count of even number is: "+even);
		System.out.println("Count of odd number is: "+odd);
		*/
		
		
		/*
		
		
		int a = 6;
		
		int count=0;  ///1, 2 
		
		if(a>1)
		{
		   for(int i= 1; i<=a; i++)
		   {
		      
			    if(a%i==0)     //7%1=0-> T,    2F, 3F, 4F, 5F, 6F , 7%7=0R T
				count++;
			}
			
			  if(count==2)
			  {
				System.out.println("Prime number");
			  }
			  else
			  {
				System.out.println("Not Prime number");
			  }
		
		}
		*/
		
		//1. Sorting elements using for loop
		//int [] b={50,20,30,100,90};
		//int [] b = new int[a.length];
	//	int [] c = new int[a.length];
	/*	//pre-defined method -> using Arrays class
		System.out.println(Arrays.toString(a));  //[50, 20, 30, 100, 90]
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));  //[20, 30, 50, 90, 100]
	*/	
		//for loop
		/*		
		int temp = 0;
		for(int n=0;n<b.length;n++)
		{
			for(int j=n+1;j<b.length;j++)
			{
				if(b[j]<b[n])
				{
					temp = b[j];   //A=B  //20 = temp 
					b[j]= b[n];   //B=C     50 = b[1]        
					b[n] = temp;   //C = A
				}
			}
		}
		System.out.println(Arrays.toString(b));    //[20, 30, 50, 90, 100]

		*/
		
		//int [] b={50,20,30,100,90};
		
		//largest number
		/*int larg = 0;
		
		for(int i=0; i<b.length; i++)
		{
			if(larg < b[i])
			{
				larg =b[i];
			}
		}
		System.out.println("The largest number is: "+larg);   //The largest number is: 100
		*/
		
		//Smallest number
//		
//		int [] b={50,20,30,100,90};
//		int small=0;
//		
//		for(int i=0; i<b.length; i++)
//		{
//			for(int j=i+1; j<b.length;j++)
//			{
//			  if(b[j]<b[i])    
//			  {
//				small = b[j];
//				b[j] = b[i];
//				b[i]= small ;
//			  }
//			}
//		}
//		System.out.println("The smallest number is: "+b[0]);   //The smallest number is: 20
//		
		
		/*
		int [] b={50,20,30,100,90};
		int small = b[0];  //50    initiate the first index as your min or max.
		
		for(int i=0; i<b.length;i++)
		{
				if(b[i]<small)   //50<20   small = 20, 30<20 
				{
					small = b[i];
				}
		}		
		System.out.println("The smallest number is: "+small);
		*/
		
		
		//largest number
		/*int [] b={50,20,30,100,90};
		int large = b[0];  //50    initiate the first index as your min or max.
		
		for(int i=0; i<b.length;i++)
		{
				if(b[i]>large)   //90>100   //small = 100 
				{
					large = b[i];
				}
		}		
		System.out.println("The smallest number is: "+large);  //The smallest number is: 100
		*/
		
		//Find missing number -> a={1,4,5,2}
		//Should be in proper order
		//should not have duplicates
		//use sum operation to find difference 
		
		/*
		int [] b={1,4,5,2};
		int sum1 = 0;
		
		for(int i=0; i<b.length;i++)
		{
			sum1 = sum1+b[i];
		}
		System.out.println("the sum of array b is: "+sum1);
		
		int sum2 = 0;
		for(int i=1; i<6;i++)
		{
			sum2 = sum2+i;
		}
		System.out.println("the sum of array b is: "+sum2);
		
		System.out.println("Missing number is: "+ (sum2-sum1));
		
		Output:
			the sum of array b is: 12
			the sum of array b is: 15
			Missing number is: 3
		*/	
		
		
		
		
		
		}
		
		
}