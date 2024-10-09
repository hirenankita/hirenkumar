package star;

public class pra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*	
		int n=11,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)	
			count++;	
		}
		//System.out.println(count);//only for check
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	*/
        int num=0,count=0;
        System.out.print("prime number : ");
		for(int i=1;i<=10;i++)
		{   
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;	
			}
		    
		    if(count==2)
		    {
		    	num++;	 	
	    	    System.out.print(i);
	    	    System.out.print(" ");
	    	
		    }
		        count=0;
		}       System.out.println(); 
		        System.out.println("total prime number =  "+num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
