package ploymerisam;

public class Polygonmanager 
{
	static Polygon getpolygon(String Polygon)
	
	{
if (Polygon.equals("square"))
{
	return new Square();
}
else
	if(Polygon.equals("rectangle"))
{
	return new Rectangle();
}
	else
	{
return null;
	}
	}
	}
