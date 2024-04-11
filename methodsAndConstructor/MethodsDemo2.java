package methodsAndConstructor;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		//We can assign values to class variable 
		//1. using object variable reference
		//MethodDemo1 obj = new MethodDemo1();
//		obj.empid=101;
//		obj.empname="Sriram";
//		obj.empsal=24600;
//		
//		System.out.println(obj.empid);
//		System.out.println(obj.empname);
//		System.out.println(obj.empsal);
		
		
		
		//2. By passing parameters through method
//		obj.Assignvalue(111, "Rajesh", 45000);
//		System.out.println(obj.empid);
//		System.out.println(obj.empname);
//		System.out.println(obj.empsal);
		
		
		
		//3. By passing parameters through Constructor
		MethodDemo1 obj = new MethodDemo1(22, "Abhi", 45900);
		System.out.println(obj.empid);
		System.out.println(obj.empname);
		System.out.println(obj.empsal);
		
		MethodDemo1 obj1 = new MethodDemo1(232, "Abhilash", 19900);
		System.out.println(obj1.empid);
		System.out.println(obj1.empname);
		System.out.println(obj1.empsal);
		
		
		/*MethodDemo1 obj = new MethodDemo1();
		obj.Method1();
		
		int M2 = obj.Method2();
		System.out.println(M2);
		
		obj.Method3(2, 4);
		
		System.out.println(obj.Method4(8));
		*/
	}

}
