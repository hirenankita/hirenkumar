package day2908;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String S = "radaR";	
		String rev = "";
		for(int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
	    	System.out.println(rev);
	    	if(S==rev)
			{
				System.out.println("palindrom");	
			}
	    	else
	    	{
	    		System.out.println("not palindrom");			
	    	}
		
	    	if(S.toLowerCase().equals(rev.toLowerCase()))
			{
				System.out.println("palindrom");	
			}
	    	else
	    	{
	    		System.out.println("not palindrom");			
	    	}
			
		
		    String oka = "h           i          r     e         n";	
		    System.out.println(oka.length());
		    int count = 0;
		    for(int i = 0;i<oka.length();i++)
		    {
		    	if(oka.charAt(i)!=' ')
		    	count++;	
		    }
		    System.out.println(count);
		    
		

	/*	String S = "hiren";	
		char ask [] = S.toCharArray();
		/*String rev = " ";
		for(int i=1; i<=S.length();i++)
		{
			rev=rev+S.charAt(S.length()-i);
		}
	    	System.out.println("huuu"+ask);
		
	        
	    	String oka = "h           i          r     e         n";	
		    System.out.println(oka.length());
		    int count = 0;
		    int count_s=0;
		    for(int i = 0;i<oka.length();i++)
		    {
		    	if(oka.charAt(i)!=' ')
		    	count++;
		    	else
		        count_s++;
		    }
		    System.out.println(count);	
		    System.out.println(count_s);	
	    */	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	}

}
