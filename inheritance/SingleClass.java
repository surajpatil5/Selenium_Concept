package inheritance;

interface sample1{
	int val = 10;
	
	void sample1method();
	
}

interface sample2{
	
	void sample1method();
	
}


public class SingleClass implements  sample1, sample2 {

	public static void main(String[] args) {
		
		SingleClass obj = new SingleClass();
		obj.sample1method();
		//Both works in order to call static variable from 1st interface
		//System.out.println(sample1.val);
		//System.out.println(obj.val);       --> with class & interface obj 
	}

	@Override
	public void sample1method() {
			System.out.println("Common method in both interfaces");
		
	}

}
