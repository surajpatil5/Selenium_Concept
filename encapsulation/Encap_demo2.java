package encapsulation;

public class Encap_demo2 {
	
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

	public static void main(String a[]) {
		
		Encap_demo2 obj = new Encap_demo2();
		System.out.println(obj.empid);     //0
		
		obj.setEmpid(20);
		System.out.println(obj.getEmpid()); //20
		
		obj.setEmpsal(20976);
		System.out.println(obj.getEmpsal());
		
		obj.setEmpname("Mahoday");
		System.out.println(obj.getEmpname());
		
		System.out.println(obj.empid);        //20
		
		
	
	}
	
	public static void main(int a[])
	{
		
	}
	


}
