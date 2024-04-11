package inheritance;

//main class
public class Animal_superKeyworddemo {
	
	String breed ="vodafone";
	
	void method1()
	{
		System.out.println("Method from main classs..");
	}
	
public static void main(String[] args) {
		
		dog obj = new dog();
		obj.displaycolor();
		obj.method1();
	}
	
}

//child class
class dog extends Animal_superKeyworddemo{
	
	String breed="shefard";
	
	void displaycolor()
	{
//		System.out.println("the value of color is: "+breed);
		System.out.println("the value of color is: "+super.breed);
	}
	
	void method1()
	{
		super.method1();
		System.out.println("Method from child classs..");
	}
	
	
}