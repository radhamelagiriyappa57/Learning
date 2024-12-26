package day3;

public class box {
	double width, heigth, length;
	box()
	{
		width=0; heigth=0; length=0;
		
	}
	box(double w, double h, double  l)
	{
		width=0; heigth=0; length=0;
		
	}

	box(double  l)
	{
		width=l; heigth=l; length=l;
		
	}
	
	double volume()
	{
		return(width*heigth*length);
	}
}
