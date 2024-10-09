package star;

public class star {

	public static void main(String[] args) {  
        int rows = 5; // Total number of rows  

        for (int i = 1; i <= rows; i++) {  
            // Print leading spaces  
            for (int j = i; j < rows; j++) {  
                System.out.print(" ");  
            }  

            // Print the decreasing sequence  
            for (int j = i; j >= 1; j--) {  
                System.out.print(j);  
            }  

            // Print the increasing sequence  
            for (int j = 2; j <= i; j++) {  
                System.out.print(j);  
            }  

            // Move to the next line  
            System.out.println();  
        }  
    }  
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


