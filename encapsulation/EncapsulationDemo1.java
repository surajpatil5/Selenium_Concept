package encapsulation;

public class EncapsulationDemo1 {
	
	int empid;
	private String empname;
	private int empsal;
	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	
	// Q -> can we overload main method?
	//In Java, you cannot overload the main method directly. 
	//However, you can have multiple main methods in the same class as long as they have different parameter lists.
	//But remember, only the main method with the standard signature (public static void main(String[] args)) will
	//be recognized as the entry point when you run the program. The other main methods are just like any other 
	//static methods and won't be invoked automatically when you execute the program.
	
	//For example:
	    public static void main(String[] args) {
	        System.out.println("This is the main method with String[] args");
	    }

	    public static void main(String arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	    
	    public static void main(Integer arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	    
	    public static void main(Float arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	    
	    public static void main(Long arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	    
	    public static void main(Character arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	    
	    public static void main(Boolean arg) {
	        System.out.println("This is another main method with a different parameter");
	    }
	}
