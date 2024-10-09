package DAY12;




public class WRAPPER {
	
	public class Hardik {
		int a = 10;
		int b = 10;
		
		public Hardik() {
			
		}
		
		int sum() {
			return a+b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String s1 = "123";
		String s2 = "321";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		int a = 10;
		String S = String.valueOf(a);
		System.out.println(S);
	*/
		int a = 10,b = 20;
		int c = a+b;
//		System.out.println(c);	
		
		Hardik H = new Hardik();
		
		int sum = H.sum();
		
		System.out.println(sum);
		
	}

}
