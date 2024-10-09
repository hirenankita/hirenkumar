package tutorial;
class typesofvariable
{
static int a =10; //Static variable
int b = 20;  // instance variable



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     	int c = 30;// local variable
     	
	    System.out.println(c); 
	    
	    System.out.println(typesofvariable.a); // Static variable does not need object 
	    
	    typesofvariable Instance = new typesofvariable();
	    System.out.println(Instance.b);// instance variable need object
	    

}

}

