package DAY12;

import java.util.HashMap;

public class Hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		HM.put(101, "ankita");
		HM.put(102, "hiren");
		HM.put(103, "chotalia");
		HM.put(104, "chotaya");
		HM.put(105, "choliya");
		HM.put(105, "hardik");
		
		System.out.println(HM);
		System.out.println(HM.get(105));
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
	
		
		
		
		
		
		
	}

}
