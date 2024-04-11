package inheritance;

class Test {
	
	final int x=100;
	
	static void method1()
	{
		System.out.println("Method 1 from Test.....");
	}
}


final public class Final_demo extends Test {
	
	static void method1()     //we can oeverride this method
	{
		System.out.println("Method 1 from Final_demo.....");
	}

	public static void main(String[] args) {

		Final_demo obj = new Final_demo();
		//obj.x=300;  //We cannot change the value of final variable, it is constant
		System.out.println(obj.x);
		
		obj.method1();
	    
	

	}

}
