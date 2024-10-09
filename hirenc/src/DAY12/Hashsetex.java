package DAY12;

import java.util.HashSet;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet mylist = new HashSet();
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("hiren");
		mylist.add("hiren");
		
		
		System.out.println(mylist);
		mylist.remove(100);

		System.out.println(mylist);
		
		mylist.add("ankita");
		
	    System.out.println(mylist);
		
	    mylist.clear();
		System.out.println(mylist);
		
		
		
		
		
		
		
		
		
	}

}
