package operators_expression_Basic;

public class Selenium1 {

	public static void main(String[] args) {

		int a = 20, b = 10;
		// Arithmatic operators --> + - * / %
		System.out.println(a + b); // 30
		System.out.println(a - b); // 10
		System.out.println(a * b); // 300
		System.out.println(a / b); // 2
		System.out.println(a % b); // 0

		// Comparison operator --> > < >= <= != == -> Returns boolean value
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // true
		System.out.println(a <= b); // false
		System.out.println(a != b); // true
		System.out.println(a == b); // false
		// b=20;
		System.out.println(a != b); // false
		System.out.println(a == b); // true

		// Logical operators --> &&(and) ||(or) !(not)
		// Always return boolean values & Works between two boolean values

//		boolean x = true;
//		boolean y = false;

		System.out.println(a == b && b == a); // false
		System.out.println(a != b || a == b); // true
		System.out.println(!(a > b)); // false
		System.out.println(!(a != b)); // false
		boolean z = a > b; // --> Statement is valid & result is true
		System.out.println(z); // true

		boolean zz = 10 > 20;
		System.out.println(zz); // false
		System.out.println(z && zz); // false
		System.out.println(z || zz); // true
		System.out.println(!z); // false
		System.out.println(!zz); // true

		System.out.println(10 > 30 && 20 < 30); // false

		// Increment/Decrement --> ++ --
		// Case 1
		int s = 10;
		System.out.println(s); // 10
		s++;
		System.out.println(s); // 11

		
		//Case 2 - Post increment
		int p = 10; 
		int post = p++; 
		System.out.println(post); // print 10 because first value 10 will assign to post & then it'll increment 
		System.out.println(p);   //11
		 

		// Case 3 - Pre-increment
		int q = 10;
		int pre = ++q; // First it will increment the value & then it'll assign
		System.out.println(pre); // 11
		System.out.println(q); // 11

		
		//decrement
		int ab =10;
		System.out.println(ab); //10
	    ab--;
	    System.out.println(ab); //9
		
		
		//Case 4 - Post decrement
		int p1 = 10; 
		int post1 = p1--; 
		System.out.println(post1); // print 10 because first value 10 will assign to post1 & then it'll decrement 
		System.out.println(p1);   //9
				 

		// Case 5 - Pre-decrement
		int q1 = 10;
		int pre1 = --q1; // First it will decrement the value & then it'll assign
		System.out.println(pre1); // 9
		System.out.println(q1); // 9
		
		
		
		//Assignment    --> = +=  -= *= /= %=
		
		long as = 5; 
		//as = as+10;
		as +=10;
		System.out.println("As value "+as);   //As value 15
		
		as -=2;
		System.out.println("As value "+as);  //13
		
		as *=2;
		System.out.println("As value "+as);   //26
		
		as /=4;
		System.out.println("As value "+as);  //6
		
		as %=4;
		System.out.println("As value "+as);  //2
		
		
		
		
		//Conditional/Ternary operator -->  ?:
		//Syntax -> var=exp ? result1:result2;
		
		//Example 1
		int c=10, g=20;
		
		int cg  = (c>g)? c :g;   //If condition is true then 'result1' will assign to variable else result2 will assign & print
		System.out.println(cg);  //20
		
		
		//Example 2
		int xy = (20==20)? 100:200;
		System.out.println(xy); //100
		
		
		long xy1 = (20!=20)? 100:200;
		System.out.println(xy1); //200
		
		//Example 3
		//to check whether person age is greater than 18 or not
		int age = 30;
		boolean elg = (age>=18)? true : false;  
		System.out.println(elg);     // true
		String elg1 = (age>=18)? "eligible" : "non eligible";  
		System.out.println(elg1);	//eligible
		
		
		
		
		
		
		//Swapping numbers
		
		int d = 10;
		int f = 20;
		
		//With Assignment operator
//		f-=d;
//		System.out.println(f); //10
//		d+=f; 
//		System.out.println(d); //20
//		
//		//Third variable
//		int v=0;
//		v=d;
//		d=f;
//		f=v;
//		System.out.println(d); //20
//		System.out.println(f); //10
		
		//using + & - operator
		d=d+f;   //10+20 = 30->d   
		f=d-f;   //30-20 = 10->f
		d=d-f;   //30-10 = 20->d
		System.out.println(d); //20
		System.out.println(f); //10
				
		
	}

}
