package inheritance;

class Bank{
	
	int a=19;
	
	String Method1()
	{
		return "Bank Method";
	}
	
	void Method2(int a)         //overloading
	{
		System.out.println("before assign: "+this.a);
		this.a=a;
		System.out.println("After assign: "+this.a);
		System.out.println("from Bank method 2 : "+a);
	}
	
	
}


class IDFC extends Bank{
	
	
	String Method1()
	{
		return "IDFC Method";
	}
	
	void Method2(int a, int b)    //overloading
	{
		System.out.println("from IDFC method 2 : "+(a+b));
	}
	
}

class AXIS extends Bank{
	
	
	String Method1()    //overriding
	{
		return "AXIS Method";
	}
	
	void Method2(double a)  //overloading
	{
		System.out.println("from AXIS method 2 : "+(a));
	}
	
}


public class OverridingDemo extends IDFC {

	public static void main(String[] args) {
		
//		//Bank obj = new Bank();						//Bank Method
//		IDFC obj = new IDFC(); 						//IDFC Method
//		//AXIS obj = new AXIS();							//AXIS Method
//		System.out.println(obj.Method1());
//		obj.Method2(30);
//		obj.Method2(200);

		//AXIS obj1 = new AXIS(30);
	}

}
