package patterns;

public class pattens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int rows=5,k=0;

		 for(int i =1;i<=rows;i++)
		 {
			 for(int j = 1;j<=rows-i;j++)
			
			 {
				 System.out.print("1");
			 }
		
				
	    while(k!=2*i-1)
		 {
			 System.out.print("0");
			 k++;
		 }
	    
	    for(int j = 1;j<=rows-i;j++)
			
		 {
			 System.out.print("1"); 
			 
		 }
		 System.out.println();
		 k=0;
		 }	
			
		 
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
