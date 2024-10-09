package day11inheritance;

	
	class bank
	{
		int roi()
		{
			return 0;
		}
	}
	
	class icici extends bank
	{
		int roi()
		{
			return 1;
		}
	}
	
	class kotak extends bank
	{
		int roi()
		{
			return 2;
		}
	}
	
	public class override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	icici ic = new icici();
	System.out.println(ic.roi());
}
}