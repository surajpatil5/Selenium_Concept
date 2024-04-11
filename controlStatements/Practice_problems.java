package controlStatements;

import java.util.Scanner;

public class Practice_problems {

	public static void main(String[] args) {

		/*
		 * //Reverse a number -> StringBufffer class -> convert value to String &
		 * StringBuilder class -> conversion is not required //float i=20.45f; //54.02
		 * String i="Welcome"; //emocleW //int i=1234; //4321 //String.valueOf -> will
		 * convert integer value to String StringBuffer sb = new
		 * StringBuffer(String.valueOf(i)); StringBuffer rev = sb.reverse();
		 * System.out.println(rev); //4321
		 * 
		 * 
		 * //float j=22.45f; //54.22 int i=3456; //6543 StringBuilder B = new
		 * StringBuilder(String.valueOf(i)); //pass the argument directly if its string
		 * or else apply (String.valueOf(var)) StringBuilder rev = B.reverse();
		 * System.out.println(rev); //jaruS
		 * 
		 * 
		 * Scanner obj = new Scanner(System.in);
		 * System.out.println("Enter the value: "); int num = obj.nextInt(); //4567
		 * 
		 * //Using Algorithm int rev = 0;
		 * 
		 * while(num!=0) { rev = rev*10+num%10; num=num/10; }
		 * System.out.println("Reverse of value is "+rev); //7654
		 */

		// Palindrome number --> 121 == 121 -> compare
		/*
		 * int i= 121; //12 //1 //0
		 * 
		 * int rev=0;
		 * 
		 * while(i!=0) { rev=rev*10 + i%10; i=i/10; } System.out.println(rev);
		 * 
		 * if(121==rev) { System.out.println("Palindrome of 121 is: "+rev); //Palindrome
		 * of 121 is: 121 }
		 */

	/*	// Count no.of digits in a number
		int num = 4372535;

		// StringBuffer B = new StringBuffer(String.valueOf(num)); // --> can be
		// achieved with StringBuffer class
		StringBuilder B = new StringBuilder(String.valueOf(num)); // --> can be achieved with StringBuilder class
		int C = B.length();
		System.out.println("Count: " + C);

		int odd = 0;
		int even = 0;

		for (int i = 0; i < B.length(); i++) {
			int a = B.charAt(i) - '0'; // VVIMP -> when you retrieve the character at index i using B.charAt(i), you
										// are actually
										// getting the ASCII value of that character, not the integer value you expect.
										// So, for example, when you see 52 printed, it corresponds to the ASCII value
										// of
										// the character '4', which is 52. Similarly, 51 corresponds to '3', 55 to '7',
										// and so on.
										// To get the actual integer value of the digit, you can subtract the ASCII
										// value
										// of '0' (Zero) from the ASCII value of the character. In Java, characters are
										// represented
										// as ASCII values internally.
			System.out.println(a);
			if (a % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("The count of odd numbers is " + odd);
		System.out.println("The count of even numbers is " + even);
		
	*/

		// Find the sum of number -> for eg-> num = 1234 -> Sum => 10
		 int num = 54265;
		 int sum = 0;
		 
		  StringBuffer obj = new StringBuffer(String.valueOf(num)); 
		  int L =  obj.length(); // -> Store length in int variable
		  System.out.println("Count is: "+L);
		  
		  for(int i=0;i<obj.length();i++) 
		  { 
			  int n = obj.charAt(i)-'0';
			  System.out.print(n+" ");
			  sum = sum+n;
			 }
		  System.out.println();
		  System.out.println("Sum of all digit is: "+sum); 
		  
		  //output 
		  /*Count is: 5
		  5 4 2 6 5 
		  Sum of all digit is: 22*/
		  
		  
		  
		  
		  int S = 121;
		  
		  StringBuffer Str = new StringBuffer(String.valueOf(S));
		 System.out.println(Str.length());
		 StringBuffer Rev= Str.reverse();
		 //Cannot compare Stringbuffer/builder with int
		 int conversion = Integer.parseInt(Rev.toString());   // --> To convert StringBuffer & StringBuilder to int.
		 
		 if(S==conversion) {
			 System.out.println("The palindrome value of: "+ S + " is "+conversion);
		 }
	     		
	}
		 
		  
		  
	}


