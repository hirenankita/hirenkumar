package day2608;

public class new0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{   
			System.out.print((i+j)%2);
		    }
			System.out.println();
		}
		*/
		int a[] = {10,20,30,30,40,40,30,70};
		
		int num = 30;
		int count =0;
		for(int x:a) 
		{
			if(x==num)
			{
				count++;
				
			}
		}
			System.out.println(count);
		}
				
		
	}


