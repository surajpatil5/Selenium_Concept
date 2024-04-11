package controlStatements;

public class Looping_Iterative {

	public static void main(String[] args) {
		
		//Print 1...10 numbers using while loop
		/*int a = 1;
		
		while(a<=10) 
		{
			System.out.print(a+" ");		//1 2 3 4 5 6 7 8 9 10 
			a=a+1;      //a+=1;       //a++;   //++a;		//a+=2					//1 3 5 7 9
		}
		System.out.println();
		
		//print hello message 10 times
		//String s = "Hello";
		int i=1;
		while(i<=10)
		{
			System.out.print("Hello"+" ");     //Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello 
			i++;
		}
		System.out.println();
		
		//Print even & odd number from 1 to 10 using while
		//aproach 1
		/*int j=1;   
		while(j<=10)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}	
			j++;
		}*/
		
		//Aproach 2
		/*int j=1;    //to print even, initialize value as 2 & to print odd, initialize as 1
		while(j<=10)
		{
			System.out.println(j);	
			j+=2;
		}*/
		
		//Aproach 3
		//want to know every number whether it is odd or even
		/*int k=1;
		
		while(k<=10)
		{
			if(k%2==0)
			{
				System.out.println(k + " even");
			}
			else
			{
				System.out.println(k+" odd");
			}
			k++;
		}*/
		
		
		//Print reverse number -> 10.....1
		/*int R = 10;
		
		//while(R>=0)							//10 9 8 7 6 5 4 3 2 1 0 
		while(R>=1)								//10 9 8 7 6 5 4 3 2 1 
		{
			System.out.print(R+" ");
			R--;
		}
		System.out.println();
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		*/
		
		
		
		//do.....while loop
		
		//To print 1........10 numbers
		/*int num =1;
		do
		{
			System.out.print(num+" ");   //1, 2, 3.....................
			num++;
		}while(num<=10);  //2 3...........
		System.out.println();*/
		//1 2 3 4 5 6 7 8 9 10 
		
		//reverse -> 10 to 1
		/*int num =10;
		do
		{
			System.out.print(num+" ");   //10, 9, 8.....................
			num--;
		}while(num>=1);  //9 8 7
		System.out.println();*/
		//10 9 8 7 6 5 4 3 2 1 
		
		
		//for loop
		//print 1 ........10 numbers
		/*
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+" ");		//1 2 3 4 5 6 7 8 9 10
		}
		System.out.println();*/
		//print only even numbers  -> 2, 4, 6, 8, 10
		
		/*for (int j=2; j<=10; j+=2)
		{
			if(j%2==0)
				System.out.print(j+" ");   //2 4 6 8 10 
		}*/
		
		//print only odd numbers  -> 1,3,5,7,9
		
		/*for (int j=1; j<=10; j++)
		{
			if(j%2==1)
			System.out.print(j+" odd");   //1 3 5 7 9
			else
				System.out.print(j+" ");
		}*/

		
		//want to every value whether it is even or odd
		/*
		for (int j=1; j<=10; j++)
		{
			if(j%2==1)
			System.out.print(j+"odd ");   //1odd  2even  3odd  4even
			else
				System.out.print(j+"even ");  //1odd 2even 3odd 4even 5odd 6even 7odd 8even 9odd 10even 
		}*/

		
		//reverse of 1..........10
		/*
		for(int i=10; i>=1; i--)
		{
			System.out.print(i+" ");       //10 9 8 7 6 5 4 3 2 1 
		}*/
		
		//Using break statement
		/*for(int i=1; i<=10; i++)
		{
			if(i==6)
			{
				break;          //it'll stop the further execution or break the entire loop -> 1,2,3,4,5
			}
			System.out.print(i+" ");       //1 2 3 4 5 
		}
		*/
		
		//Want to skip some values -> 4,5,6
		for(int i=1; i<=10; i++)
		{
			if(i==6 || i==5 || i==4)
			{
				continue;          //continue will directly contact to third part/ increment-decrement 
								   //It'll not allow to execute further statements
			}
			System.out.print(i+" ");       //1 2 3 7 8 9 10  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
