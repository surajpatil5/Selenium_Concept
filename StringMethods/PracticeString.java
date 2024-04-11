package StringMethods;

public class PracticeString {

	public static void main(String[] args) {
		
		//Check string is palindrome or not
		
		String S = "MADAM";
		String Reverse ="";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			char A = S.charAt(i);
			Reverse = Reverse + A;
		}
		System.out.println(Reverse);
		
		if(S.equals(Reverse))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
		
		//output:
//		MADAM
//		This is palindrome
		
		
		
		String str = "Welcome";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char R = str.charAt(i);
			rev +=R;
		}
		System.out.println(rev);
		
		if(str==rev)
			System.out.println("This is palindrome");
		else {
			System.out.println("This is not palindrome");
		}
		
		//output
//		MADAM
//		This is palindrome
//		emocleW
//		This is not palindrome
		
		
		//Remove junk or special characters in string
		
		String L = "   Th$is is awes*ome dude  ";
		String C = L.trim().replace("$", "").replace("", "").replace("*", "");
		System.out.println(C);   //This is awesome dude
		
		
		//Count occuerences of characters in string -> how many times 'g' has repeated 
		
//		String A = "aggdshgsagjagdfdakdgagd";
//		
//		char [] Chr = A.toCharArray();  //Either use String method -> charAt to call every value or convert string to char array
//		char a = 'a';
//		int countofg = 0;
//		
//		for(int i=0; i<Chr.length;i++)
//		{
//			char AB = Chr[i];
//			if(AB == a)
//			{
//				countofg++;
//			}
//		}
//		System.out.println(countofg);  //5
		
		
		String sen = "Today I have been to marine lines";
		
		String arr[] = sen.split(" ");
		System.out.println(arr.length);  //7
//		char singlechar = ' ';
//		int countsofword = 0;
//		
//		
//		for(int i=0; i<sen.length();i++)
//		{
//			char ch = sen.charAt(i);
//			if(ch == singlechar)
//			{
//				countsofword++;
//			}
//		}
//		System.out.println(countsofword);
		
		
		
		
		
    }

}
