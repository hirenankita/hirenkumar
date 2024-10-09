package arraypractice;

import java.util.Scanner;

public class try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[6]; int sum = 0;
		Scanner r = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{	
		 a[i] = r.nextInt();
		}
		int b=a.length;		   
		System.out.println("length of array  "+b);	
		for(int i=0;i<a.length;i++)
		{	
		System.out.print(a[i]+"  ");	
		sum = a[i]+sum;
		
		}
		System.out.println();
		System.out.println("sum of array  "+sum); 
		
 		
		
		
		
		
		
		
	}

}
