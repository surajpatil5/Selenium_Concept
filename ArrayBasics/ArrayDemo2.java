package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		
		//Search an element in array -> 1,2,3,4,5,6  ->   4 is present in array or not
		
//		int[] a = {11,22,33,44,55,66};
//		int b=44;
//		boolean S = false;    //true means found & false means not found
//
//		/*for(int i=0; i<=a.length-1;i++)	
//		{
//			if(b==a[i])
//				{
//					System.out.println("Found the element- "+ a[i]);
//					S = true;
//					break;
//				}
//				
//				 * else 
//				 * {
//				 *  System.out.println("Not Found the element"); //to overcome printing this every time
//				 *  
//				 *  }
//				 */
//		
//	
//		
//		//Enhanced for loop
//		for(int num:a)	
//		{
//			if(b==num)
//				{
//					System.out.println("Found the element- "+ num);
//					S = true;
//					break;
//				}
//		}
//		  //System.out.println("Not Found the element");   //Even its true it'll again print if for loop fails
//		// that's why put this condition using boolean s whenever it's true this block will not execute
//		if(S==false)
//		  {
//			  System.out.println("Not Found the element");
//		  }
		  
		
		//Find number of repetition
		int[] a = {11,22,33,22,55,22,11,33,33,33,55};
		int b = 22;
		int count=0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(b==a[i])
			{
				count++;
			}
		}
		System.out.println("\"The value "+b+" occurs multiple times & the count of occurence is : "+count);
		
	
		//To print an arrays values  -> we can use for loop, enhanced for loop or there is a pre-defined method
		int[] i = {11,33,22,55,43,56};
		
		//Arrays is a class in java. it's used to convert an array into a string representation.
		System.out.println("before sorting........"+Arrays.toString(i));		//before sorting........[11, 33, 22, 55, 43, 56]
	
		//To sort an array, there is another method
		Arrays.sort(i);
		//Remember to print above array, either use loop or pre-defined method which is "Arrays.toString(array)"
		System.out.println("After sorting........"+Arrays.toString(i));  //After sorting........[11, 22, 33, 43, 55, 56]
	
		
		
		//Sorting char & String values 
		
		String[] str = {"Jay", "Raj", "Aniket", "Praful", "Jyotika"};
		char ch[] = {'A','D','b','F','u','K','E','e'};
		
		System.out.println("before sorting..");				//[A, D, b, F, u, K, E, e]
		System.out.println(Arrays.toString(ch));		//[Jay, Raj, Aniket, Praful, Jyotika]
		
		Arrays.sort(ch);
		System.out.println("After sorting..");			// [A, D, E, F, K, b, e, u]
		System.out.println(Arrays.toString(ch));       //[Aniket, Jay, Jyotika, Praful, Raj]
		
		
		
		//Print array values in reverse order
		int []seq = {12,23,4,6,34,5,66,4,36,33};
		
		for(int j=seq.length-1; j>=0; j--)
		{
			System.out.print(seq[j]+" ");		//33 36 4 66 5 34 6 4 23 12 
		}
		
		System.out.println();
		//Take value from user using console
		//Scanner class to take values from console
		
		//Scanner obj = new Scanner(System.in);
		//System.out.println("Enter some value: ");
		//String val = obj.next();   //to take string value
		//int val = obj.nextInt();   //to take int value
		//boolean val = obj.nextBoolean();  //to take boolean value
		//System.out.println(val);
		
		
		
		
		//Reading data from console & storing it in array
		
		int arr[] = new int[5];
		
		Scanner read = new Scanner(System.in);
		
		for(int x=0;x<arr.length;x++)
		{
		   System.out.println("Enter the values: ");
		   arr[x] = read.nextInt();
		}
		
		
		System.out.println(Arrays.toString(arr));      //[1, 2, 4, 6, 8]
		
		
		
		
	}		
}



