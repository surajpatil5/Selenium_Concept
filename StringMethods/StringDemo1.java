package StringMethods;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {

		//length()
		//String S = "Welcome";
		//System.out.println("Length of S is: "+S.length()); //Length of S is: 7 // -> brackets will be added in STring but not in array (S.length)

		//two ways to declare string 
		//String S = "Welcome";
//		String S = new String("Welcome");
//		System.out.println("Length of: "+S+ " is: "+S.length());  //Length of: Welcome is: 7
//		System.out.println("Length of: "+S+ " is: "+"Welcome".length());  //Length of: Welcome is: 7
		
		//concat() --> joining two strings/vaues
//		String S = "Welcome";
//		String S1 = S.concat(" to my home");
//		System.out.println(S1);    //Welcome to my home
		
//		String S1 = "Welcome";
//		String S2 = " to my home";
//		String S3 = S1.concat(S2);
//		System.out.println(S3);  //Welcome to my home
		
//		String S1 = "Welcome";
//		String S2 = " to my home";
//		//String S3 = " guys ";
//		String S4 = S1.concat(S2).concat(" guys ");   //Welcome to my home guys
//		System.out.println(S1+S2); //Welcome to my home
//		System.out.println(S1+S2+" guys "); //Welcome to my home guys 
//		System.out.println(S4);   //Welcome to my home guys
		
		//trim() -> remove spaces from left & right side
//		String S2 = "   to my home ";
//		String S3 = S2.trim();
//		System.out.println(S2.trim().length());  //10  -> only return length
//		System.out.println(S3);  //to my home

		//charAt() -> Return character from String based on index
//		String S1 = "Welcome";
//		System.out.println(S1.charAt(3));  //c

		//contains() -> to check whether certain value is a part of string or not
//		String S1 = "Welcome";	
//		String S2 = " to my home";
//		System.out.println(S1.contains(S2));      //false
//		System.out.println(S1.contains("e"));		//true
		
		//equals() -> returns true if both strings values are same
//		String S1 = "Welcome";	
//		String S2 = " to my home";
//		String S3 = "welcome";	
//		System.out.println(S1.equals(S2));   //false
//		System.out.println(S1.equals(S3));   //false -> case sensitive
//		//equalsIgnorecase() -> use for comparison only.
//		System.out.println(S1.equalsIgnoreCase(S3));  //true
		
		
		//replace() -> replace single or multiple of characters in a string   ---> Can replace multiple or sequence of characters
		
//		String S1 = "Welcome all of you to my home guys";	
//		String S2 = S1.replace('o', 'O');   //Welcome all of you to my home Guys
//		System.out.println(S2);  //WelcOme all Of yOu tO my hOme guys
		
		//substring -> It'll substring from main string
//		String S1 = "Welcome";
//		String S3 = "programming";
//		String S2 = S1.substring(1, 5);
//		System.out.println(S2);  //elco
//		System.out.println(S1);  //Welcome
//		System.out.println(S3.substring(2, 10));  //ogrammin 
	
//		String S1 = "Welcome";
//		String S2 = S1.toUpperCase();
//		System.out.println(S2);    //WELCOME
//		System.out.println(S1.toLowerCase());   //welcome
		
//		String S1 = "Welcome";
//		String [] S2 = S1.split("c");
//		System.out.println(Arrays.toString(S2));  //[Wel, ome]
//		
//		String S3 = "Surajpatiil2111998@gmail.com";
//		String[] S4 = S3.split("@");
//		for(int i=0;i<S4.length;i++)
//		{
//			System.out.print(S4[i]+" ");     //Surajpatiil2111998     gmail.com   
//		}
		
		//want to remove unnecasary things & want a number
//		String am = "$15,86,86";   
//		String s1= "abc,123@hcdj";
//		String S1 = am.replace("$", "").replace(",","").trim(); //->  both char & String will work but for char- empty char not work 
//		System.out.println(S1); //158686
//		
//		System.out.println(s1.replace(",", "").replace("@", ""));   //abc123hcdj
		
//		String am = " 15 86 SJDJJDG 86    "; 
//		System.out.println(am.replace(" ", "").trim());    //1586SJDJJDG86
//		
		
		//There are certain restrictions where we cannot use as delimeter -> * % ^ & ( )
		
//		String am = "!@#$%^&*()))()";
//		System.out.println(am.replace("&","*")); //!@#$%^**()))()
//
//		
//		String S = "John Kannedy";
//		System.out.println(S.contains("john"));   //false
//		String S1 = S.replace('J','j');   //john Kannedy
//		System.out.println(S1.contains("john"));   //true
//		String S2 =S.toLowerCase();     //john kannedy
//		System.out.println(S2.contains("john"));  //true
//		
		
		//Task 1 -> print Reverse String using for loop
//		String S = "Java Programming";
//		
//		String S1="";
//		
//		for(int i=S.length()-1;i>=0;i--)
//		{
//			char A = S.charAt(i);
//			S1 = S1+A;          //use concatenation to add char into string
//		}
//		System.out.println(S1);    //gnimmargorP avaJ
		
		
		
		//print Reverse String without using string methods -> convert string to chararray
		
//		String S = "Java Programming";
//		char[] C = S.toCharArray();
//		String reverse="";
//		
//		
//		for(int i=C.length-1;i>=0;i--)
//		{
//			reverse = reverse + C[i];
//		}
//		System.out.println(reverse);      //gnimmargorP avaJ
		
//		String S = "Java Programming";
//		String S4 = " is easy";
//		
//		//StringBuffer str = new StringBuffer(String.valueOf(S));  //gnimmargorP avaJ
//		StringBuilder str = new StringBuilder(String.valueOf(S));  //gnimmargorP avaJ
//		StringBuilder rev = str.reverse();
//		System.out.println(rev.append(S4));   //here i'm joining two strings together & no need to create variable separately
//		
//		System.out.println(rev);     //gnimmargorP avaJ 
//		
//		//sort
//		int [] a = {1,2,6,5,6,17,8};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		
//		String S1 = "Hello";
//		//String S2 = "hello";
//		String S2 = "Hello";
//		
//		boolean B = (S1==S2);
//		System.out.println(B);				//false    //true
//		System.out.println(S1.equals(S2));  //false    //true
		
//		String S1 = "Hello";
//		String S2 = new String("Hello");
//		System.out.println(S1==S2);		   //	false  -> Because objects are different	--> comparing objects
//		System.out.println(S1.equals(S2)); //   true   -> comparing values of objects
		
//		String S1 = "Hello";
//		String S2 = new String("Hello");
//		String S3 = S2;
//		System.out.println(S1==S2);    //false
//		System.out.println(S1==S3);    //true
//		System.out.println(S2==S3);    //false     //true
//		System.out.println(S1.equals(S2));      //true
//		System.out.println(S2.equals(S3));     //true
//		System.out.println(S3.equals(S1));      //true
//		
		
		String S1 = "hello";
		String S2 = "lleho";
		
		char[] A = S1.toCharArray();
		char[] B = S2.toCharArray();
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		Arrays.sort(A);
		Arrays.sort(B);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		if(Arrays.equals(A, B))		//To compare the contents of arrays in Java, you need to use Arrays.equals(A, B) method.
		{
		System.out.println("Anagram");
		}
		else
			System.out.println("No anagram");
		
		//Output:
		/*[h, e, l, l, o]
		[l, l, e, h, o]
		[e, h, l, l, o]
		[e, h, l, l, o]
		Anagram
		*/
		
		
	}

}
