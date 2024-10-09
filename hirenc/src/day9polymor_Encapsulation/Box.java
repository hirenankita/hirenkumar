package day9polymor_Encapsulation;

public class Box {

	double width, length ,height;
	 Box()
		{
			width=length=height=0;	
		}
		
	 Box(double w,double l,double h)
	 {
		 width=w;
		 length=l;
		 height=h;
	 }
		
		double sum()
		{
			return(width*length*height);
		}
			
		
	

}
