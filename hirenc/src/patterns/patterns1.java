package patterns;

public class patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,rows=3,count=1;
		for(i=1;i<=rows;i++)
		{
		  for(j=1;j<=rows;j++)
		  {
			 if(j<=i)
			{
		    	System.out.print(count);
		    	count++;
			}
			
			else
			{
				System.out.print(" ");
			}	  
		  
		  }
		  System.out.print("\n");		 	
		   count=1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
