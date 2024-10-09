package patterns;

public class patterns33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rows=3,k=0,count=1;

		 for(int i =1;i<=rows;i++)
		 {
			 for(int j = 1;j<=rows-i;j++)
			
			 {
				 System.out.print(" ");
			 }
		
				
	    while(k!=2*i-1)
		 {
	    	if(k%2==0 && k>0)
	    	{
	    		count=1;
	    		//System.out.print("count");
	    	}
			 System.out.print(count);
			 k++;
			 count++;
		 }
	    
	     
		 System.out.println();
		 k=0;
		 count=1;
		 }	
	      
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
