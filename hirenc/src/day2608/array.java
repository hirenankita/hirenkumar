package day2608;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

/*
      char[][] mmm = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
        System.out.println(mmm.length);
        System.out.println(mmm[0][1]);
        for(int r=0;r<=mmm.length-1;r++)
      {
    	  for(int c=0;c<=mmm[r].length-1;c++)
    	  {
    		  System.out.print(mmm[r][c]);
    	  }
    	      System.out.println();
      }
          
        
        
        
        int [][] mmm= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(mmm.length);
        System.out.println(mmm[0][1]);
        
        for(int r=0;r<=mmm.length-1;r++)
      {
    	  for(int c=0;c<=mmm[r].length-1;c++)
    	  {
    		  System.out.print(mmm[r][c]);
    	  }
    	      System.out.println();
      }
      */
		
		
		
		
            String[][] a = {{"hiren ","hardik ","babubhai "},{"ankita ","momika ","bhavnaben "},{"chotaliya ","chotaliya ","chotaliya "}};
          /*  for(int i=0;i<=a.length-1;i++)
            {
            	for(int j=0;j<=a[i].length-1;j++)
            	{	
                  System.out.print(a[i][j]);
            	}
            }     System.out.println();
		*/
		       for(String i[] : a)
		       {
		    	for(String j : i) 
		    	{
		    		System.out.print(j);
		    	}
		    	     System.out.println();
		       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}