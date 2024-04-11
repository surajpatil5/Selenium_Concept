package controlStatements;

public class Conditional {

	public static void main(String[] args) {
		
		//Example 1
		// To check whether person is senior citizen or not
		int sen_czn_age = 55;
		/*if (sen_czn_age>=60)   //boolean
		{
			System.out.println("Yes, he is senior citizen & his age is "+ sen_czn_age); //Yes, he is senior citizen & his age is 65.
		}
		else
		{
			System.out.println("No, he is not senior citizen as his age is "+ sen_czn_age); //No, he is not senior citizen as his age is 55
		}*/
		
		//If we have single statement under the (if & if..else) condition then braces are optional, we can remove it.
		//for eg.
		
		if(sen_czn_age>60) {
			System.out.println("He is eligible");
		    System.out.println("will get service");}
		else
			{System.out.println("He is not eligible");
		    System.out.println("will not get any service");
			}
		
		
		//Example 2
		// To check whether the number is odd or even
		
		int a = 22;
		if(a%2==0)   // % return reminder which is 0.
		System.out.println(a+" num is even");
		else
			System.out.println(a+" num is odd");
			
		
		//Example 3
		//Check number is positive, negative or zero
		//int num=-33;
		//int num=3;
		int num=0;
		if (num==0)
			System.out.println(" this is 0");		// this is 0
		else if(num<0)
			System.out.println(num+" this is negative");   // -33 this is negative
		else
			System.out.println(num+" this is positive");	//3 this is positive
			
		
		
		//Example 4
		//Find largest number of 3
		int x=20,y=30,z=50;
		
		if(x>y && x>z) {
			System.out.println(x+" is the largest number among 3");
		}
		else if(y>x && y>z) {
			System.out.println(y+" is the largest number among 3");
		}
		else																//Last else should not have condition.
		{
			System.out.println(z+" is the largest number among 3");
		}
			
		///50 is the largest number among 3
			
			
		
		//Nested_if else -> Under one if condition there is one more if condition
		//With boolean values
		//if(false)
		if(false)  //Ultimately we need a boolean value, if(1==1), if(1!=2), in this case also it'll work
		{
			if(true)
			{
			System.out.println("true");   //true
		    }
		    else
		    {
			System.out.println("false");  //false
		    }
		}
		else
		{
			System.out.println("all was fake");			//all was fake
		}
			
		
		//Example 5
		//Display day names based on day number in a week -> Day no 1 = display Monday
		int d=8;
		if(d==1) {
			System.out.println("Sunday");
		}
		else if(d==2) {
			System.out.println("Monday");
		}
		else if(d==3) {
			System.out.println("Tuesday");
		}
		else if(d==4) {
			System.out.println("Wednesday");
		}
		else if(d==51) {
			System.out.println("Thursday");
		}
		else if(d==6) {
			System.out.println("Friday");
		}
		else if(d==7) {
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("1st week has gone");
		}
			
			
		
		//Switch Statement
		
	//	int dayno=3;  //Tuesday
	//	int dayno=8;  //Week has over
	//	int dayno=7;  //Saturday
		int dayno=2;  //Monday   --> It'll print next statement as well coz break; is missing.
		              //Tuesday
		
		switch(dayno)
		{
		case 1: System.out.println("Sunday");
				break;
		case 2: System.out.println("Monday");
				
		case 3: System.out.println("Tuesday");
				break;
		case 4: System.out.println("wednesday");
				break;
		case 5: System.out.println("Thursday");
				break;
		case 6: System.out.println("Friday");
				break;
		case 7: System.out.println("Saturday");
				break;
		default:System.out.println("Week has over");		
		}
			
			
			
		//Largest of two numbers
		int h =100;
		int b = 200;
		
		//if..else
		if(h>b)
			System.out.println("h is largest: "+h);
		else
			System.out.println("b is largest: "+b);   //b is largest: 200
		
		//ternary operator
		int res = (h>b)? h:b;
		System.out.println(res+" is the largest number");  //200 is the largest number
		
		
		//Smallest of 3 numbers (if..else)
		int one,two,three;
		one = 100;
		two = 80;
		three = 200;
		
		//if....else
		if(one<two && one<three)
			System.out.println(one +" is the smallest number");
		if(two<one && two<three)
			System.out.println(two +" is the smallest number");
		if(three<two && three<one)
			System.out.println(three +" is the smallest number");   //80 is the smallest number
		
		
		//String day = "Wednesday";		//4
		//String day = "Saturday";		//7
		String day = "wednesday";
		
		switch(day)
		{
		case "Sunday" : System.out.println(1);
					 	break;
		case "Monday" : System.out.println(2);
	 					break;
		case "Tuesday" : System.out.println(3);
	 					break;
		case "Wednesday" : System.out.println(4);
	 					break;
		case "Thursday" : System.out.println(5);
	 					break;
		case "Friday" : System.out.println(6);
	 					break;
		case "Saturday" : System.out.println(7);
	 					break;
	 	default : System.out.println("You have enter wrong value");  //You have enter wrong value
					 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
	}

}
