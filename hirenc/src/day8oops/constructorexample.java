package day8oops;

public class constructorexample

       {

		int sid;
		String sname;
		char grad;
		void printnew ()
		{
			System.out.println(sid+" "+sname+" "+grad);
		}
		constructorexample(int i,String j,char k)
		{
			sid = i;
			sname = j;
			grad = k;
		
		}
		constructorexample()
		{
		
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			constructorexample ME = new constructorexample(101,"chotaliya",'a');
			ME.printnew();
			constructorexample ME1 = new constructorexample(102,"hiren",'b');
			ME1.printnew();
			constructorexample ME2 = new constructorexample();
			ME2.printnew();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
