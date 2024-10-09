package day9polymor_Encapsulation;

public class Boxnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box BO=new Box(11.0,11.0,11.0);
		System.out.println(BO.sum());
		Box BO1 = new Box(11.0,11.0,1);
		System.out.println(BO1.sum());
	}

}
