//Q34
import java.util.Scanner;
class circle{
	private double radius;
	private double area;
	void init( double rad)
	{
		radius = rad;
		
	}
	void Area()
	{
		area = 3.14*radius*radius;
		//return area;
	}
	void Display()
	{
		System.out.println("area of circle is" +area);
	}
}

class AreaDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double radd = sc.nextDouble();
		circle c = new circle();
		c.init(radd);
		c.Area();
		c.Display();	
	}
}