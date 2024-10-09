package day2908;

public class ignorespecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " h ir e n" ;
		String nospace = s.replaceAll("\\s", "");
		System.out.println(nospace);
		
		String d = "       hi!   @   #$     ren     ";
		String g = d.replaceAll("[!@#$]*", "");
		//String h = g.replaceAll("\\s", "");
		System.out.println(g.replaceAll("\\s", ""));
				
		
		
		
		
		
		
		
		
		
		
	}

}
