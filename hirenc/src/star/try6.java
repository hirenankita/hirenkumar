package star;

public class try6 {
	
	
	public static void main(String[] args) {  
        int n = 4; // Change this value for different sizes of the pattern  

        for (int i = n; i >= 1; i--)
        { // Loop for the number of rows  
            // Print leading spaces  
            for (int j = 1; j < i; j++)
            {  
                System.out.print(" "); // Print two spaces for each leading space  
            }  

            // Print numbers in decreasing order  
            for (int j = i; j <= n; j++) 
            {  
                System.out.print(j); // Print the number  
            }  

            // Move to the next line after each row  
            System.out.println();  
        }  
    }  
}  


