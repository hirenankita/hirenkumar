package day2608;

public class day42608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]=new int [3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		int a[]= {1,2,3};
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);
		}
		for(int x:a)
		{
		System.out.println(x);	
		}
		*/
		int [][]numarray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		/*System.out.println("no of rows = " +numarray.length);
		System.out.println("no of column = "+numarray[0].length);
		System.out.println("element = "  +numarray[2][2]);
		for(int r = 0; r<=numarray.length-1;r++)
		{
			for(int c = 0;c<=numarray[0].length-1;c++)
				
			{
				System.out.print(numarray[r][c]);
			}
			    System.out.println();	
	     }
		*/  System.out.println(numarray.length * numarray[0].length);
		   	for(int arr[] : numarray)
		   	{
		   		for(int x : arr)
		   		{
		   			System.out.print(x);
		   		}
		   		    System.out.println();
		   	}
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}
