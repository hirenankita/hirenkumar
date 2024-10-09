package day2608;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr []= {10,20,30,40,50,60,70,80,90,};
		int count=0;
		int g=20;
		
		int search_element = 40;
		boolean status = false;
		
		for(int i =0 ;i<arr.length-1;i++)
		{
			if(arr[i]==search_element)
			{   
				
				System.out.println("found");
				status=true;
				break;
			}
			if(status=false)
			{
				System.out.println("not found");
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
