package inheritance;

//Single level Inheritance
/*public class Inheritance_Demo1 {

	int b=0;
	
	void Single()
	{
		System.out.println(b);
	}
}


class Child extends Inheritance_Demo1 {	
	int c=0;
	void Single1()
	{
		System.out.println(c);
		System.out.println(b);
		System.out.println("Additionof c & b is:  "+(c+b));
	}*/


//Multi-Level inheritance
/*public class Inheritance_Demo1{
	
	String S = "Maharaj";
	
	void M1(int a)
	{
		System.out.println("Param value is: "+a);
		System.out.println(S);
	}
	

}

class Child1 extends Inheritance_Demo1{
	
	String Y = "1stChild";
	
	void M2(int a)
	{
		System.out.println("M2 param value is: "+a);
		System.out.println(Y);
	}

}

class child2 extends Child1{
	
	String Z = "2ndChild";
	
	void M3(double a)
	{
		System.out.println("M3 double value is: "+a);
		System.out.println(Z);
	}
	*/

//Hierarchical Inheritance
public class Inheritance_Demo1{

	private int empid = 233;
	
	void M1(int a)
	{
		System.out.println("Initial id is: "+empid);
		empid = a;
		System.out.println("Employee id is: "+empid);
	}
	
}

class FirstChild {

	private String empname = "Suraj";
	
	void M2(String a)
	{
		System.out.println("Initial name was: "+empname);
		empname = a;
		System.out.println("New Employee name is: "+empname);
	}
	
}

class SecondChild extends Inheritance_Demo1{

	String emplastname = "Patil";
	
	void M3(String a)
	{
		System.out.println("Initial last name was: "+emplastname);
		emplastname = a;
		System.out.println("New Employee last name is: "+emplastname);
	}
	
}
