package star;

public class pra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				String ford ="hiren";
		String Revs	= "";
		for(int i = 1; i<=ford.length();i++)
		{
			Revs = Revs+ford.charAt(ford.length()-i);
		}
            System.out.println(Revs);  		
	
		if(Revs==ford)
		{
			System.out.println("word is palindrom");
		}
		
		else
		{
			System.out.println("word is not palindrom");
		}
		
        System.out.println(ford.toLowerCase()) ;   

        System.out.println(Revs.toLowerCase()) ; 
        
		if(ford.toLowerCase()==(Revs.toLowerCase()))
		{
			System.out.println("word is palindrom");
		}
		
		else
		{
			System.out.println("word is not palindrom");
		}	
		
		
		
		
		
		
		}
	}


		
		
		
	


