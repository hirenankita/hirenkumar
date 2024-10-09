package star;

public class pra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*          1
		          2 1
		        3 2 1   
              4 3 2 1		
 		*/
		
		
		int row=4;
		for(int i = 1; i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j<=row-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print((row-j)+1);
				}
            }
                    System.out.println(); 			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
