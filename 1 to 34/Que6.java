import java.util.Scanner;
class Que6 {
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radius");
	double r = sc.nextDouble();
	double a = 3.14 * r * r;
	double c = 2 * 3.14 * r;
	double ar = a;
	double cr = c;
	System.out.println("area is " +ar);
	System.out.println("circumference is " +cr);
	}
  }
	