package ArrayBasics;

public class ArrrayDemo1 {

	public static void main(String[] args) {
		
	/*	//1. Declare an Array:
			int[] a = new int[3]; // -> size is pre-defined
			a[0]=2;   
			a[1]=12;	
			a[2]=22;
			
		//	OR

		  int b[] = {2,3,5,7,8,6};   //-> You can increase the size of an array by adding values


	//	2.  Find length of an array
			System.out.println("Length of a array is: "+a.length);
		    	System.out.println("Length of b array is: "+b.length);

		//3. Read single value from an array
			System.out.println(a[2]);
			System.out.println(b[4]);

		//4. Read multiple values

			//1. for loop
				for(int i=0; i<a.length; i++)    
					System.out.print(a[i]+" ");
					System.out.println();
		    //    2. Enhanced for loop
				for(int C:b)
					{
					  System.out.print(C+" ");
					}
				System.out.println();*/
				
			
				
		
			//1. Declare an Multi dimensional array & add values

				//Aproach 1
				int T[][] = new int[3][2];
				 T[0][0] = 2;	
				 T[0][1] = 4;

			     T[1][0] = 6;	
				 T[1][1] = 8;

				 T[2][0] = 9;	
				 T[2][1] = 10;	

				//Aproach 2
			//int T[2][2] = { {2, 4}, {6,8}, {9,10} };

		//2. Find size of an array
				System.out.println("The length of array T is: "+T.length);               //  --------> This will give the length of rows
				System.out.println("The length of column of an array T is: "+T[0].length);	  //--------> This will give the length of 0th index row's column	


		//3. Read single value from an array
			//to find 1th index value of row & column
				System.out.println(T[1][1]);    //8
				
			//to print 10
				System.out.println(T[2][1]);    //10

		//4. Read multiple values from an array
			//for loop
			for(int r=0; r<T.length; r++)
				{
					for(int c=0; c<T[r].length; c++)
						{
							System.out.print(T[r][c]+" ");
						}
					System.out.println();
				}
							
			//enhanced for loop
			for(int val[] :T)
				{
					for(int finalval:val)
						{
						    System.out.print(finalval+" ");
						}
					System.out.println();
				}		
				
				
			//Object

			Object a[] = {23, 34, 'A', "Shri ram", "Jesus", true};

			for(Object S:a)
			{
				System.out.print(S+" ");
			}
			System.out.println();
			
			for(int i=1-1; i<=a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}

				
				

	}

}
