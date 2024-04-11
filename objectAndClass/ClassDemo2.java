package objectAndClass;

//import packagename.classname;  -> to import package from another class

public class ClassDemo2 {

	public static void main(String[] args) {
		
		ClassObjectDemo1 obj = new ClassObjectDemo1();
		obj.gender = 'M';
		obj.stdid = 3;
		obj.stdname="Thomas";
		obj.stdrank=1;
		obj.display();
		
		
		ClassObjectDemo1 obj1 = new ClassObjectDemo1();
		//obj1.gender = 'F';
		obj1.stdid = 2;
		obj1.stdname="Aleena";
		obj1.stdrank=2;
		obj1.display();

	}

}
