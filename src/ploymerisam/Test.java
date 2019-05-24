package ploymerisam;

public class Test {

	public static void main(String[] args)
	{ 
		Polygon p1,p2;
		p1=Polygonmanager.getpolygon("square");
		p2=Polygonmanager.getpolygon("rectangle");
		 p1.area(10,10); 
	     p2.area(10,20);
		
		

	}

}
