package Day12Arrayexa;

import java.util.ArrayList;

public class Arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList mylist = new ArrayList();
	
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("hiren");
		mylist.add("hiren");
		
		System.out.println(mylist.size());
		System.out.println(mylist.get(2));
		
		mylist.add(1,"ankita");
		System.out.println(mylist);
		
		mylist.remove(1);
		System.out.println(mylist);
		
		mylist.set(1, "ankita");
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println(mylist);
	}

}
