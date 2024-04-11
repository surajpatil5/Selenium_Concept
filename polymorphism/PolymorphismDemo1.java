package polymorphism;

public class PolymorphismDemo1 {
	
	int empid;
	int empsal;
	int joiningyear;

	void Method1()   // Methods name should be same.
	{
		System.out.println("Default constructor method");
	}
	
	void Method1(int a, int b)    //No.of parameters should be different
	{
		System.out.println("Addition is: "+ (a+b));
	}
	
	float Method1(int a, float b)  //Data type of parameters should be different
	{
		System.out.println("Addition of int & float value is: "+ (a+b));
		return (a*b);
	}

	//We don't consider return type in overloading, we only consider method name & data types.
	String Method1(float b, int a)   //Order of parameters should be different 	
	{
		System.out.println("Addition of float & int value is: "+ (b+a));
		return "Returning String";
	}
	
	
	PolymorphismDemo1()    //default constructor
	{
		joiningyear=empid=empsal=1;  
	}
	
	PolymorphismDemo1(int a)  //Parameterized constructor
	{
		this();
		System.out.println("values of class variables are: "+ joiningyear +" "+ empid+" "+" "+ empsal );
		System.out.println(a);
	}
	//IMP->  if you create an object using the parameterized constructor, you'll 
	//see 0 printed because class level variable value hasn't been initialized in that constructor.
	//To get 10, you need to call the default constructor (Using this() keyword), which 
	//initializes class level variable value to 10. Then you can use the value of myValue in
	//the other constructor.
	
	//Output before calling default constructor
//	values of class variables are: 0 0  0
//	34
	
	//Output after calling default constructor
//	values of class variables are: 1 1  1
//	34
	
	
	
	
	
	
	
	
}
