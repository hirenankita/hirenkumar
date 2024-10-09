package star;

public class try3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,count=1,rows=4;
		for(i=1;i<=rows;i++)
		{
			for(j=rows;j>=i;j--)
			{
				System.out.print("$");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
//				count++;
				
			}
			System.out.println();
		}   
		
		
		
		
		
		
		
		
		
	}

}
