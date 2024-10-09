package arraypractice;

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5], sum=0;
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<=4;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		 int c=a.length;
		 System.out.println(c);
		for(int b : a)
		{
//			System.out.print(b+" ");
			
			sum=b+sum;
					
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
