package tutorial;
public class ins
{
	int a; String b;boolean c;
	
	void ref()  
 	{   
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);	
	}	
	ins()
	{
		x=a;
		x=100;y="hiren";z=true;
		
	}
}
class B 
{
	public static void main(String[] args) 
	{
	ins r = new ins();
	r.ref();
    }

}


