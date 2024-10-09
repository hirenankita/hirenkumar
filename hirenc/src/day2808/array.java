package day2808;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Object a[]= {100,1,0.5,"hiren",'a',true};
		for (Object x : a)
		{
			System.out.println(x);
		}
	*/ 
		
		int arr[]= {10,20,30,40,50,60,70};
		int S =50;
		boolean v =false;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==S)
			{
			System.out.println("element found");
			v=true;
			break;
			}
			if(v=false)
			{
			System.out.println("element not found");
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
