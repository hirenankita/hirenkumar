package day8oops;

public class methodexample {
	
	
	int sid;
	String sname;
	char grad;
	void printnew ()
	{
		System.out.println(sid+" "+sname+" "+grad);
	}
	void studentdata(int i,String j,char k)
	{
		sid = i;
		sname = j;
		grad = k;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodexample ME = new methodexample();
		ME.studentdata(101, "chotaliya", 'a');
		ME.printnew();
		
		methodexample ME1 = new methodexample();
		ME1.studentdata(102, "hiren", 'b');
		ME1.printnew();
		
		methodexample ME2 = new methodexample();
		ME2.studentdata(103, "ankita", 'c');
	    ME.printnew();
		
		
		
		
		
	}

}
