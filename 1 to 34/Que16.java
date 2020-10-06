import java.util.Scanner;
class Que16{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a three digit number");
	int n = sc.nextInt();
	int u = n%10;
	n = n/10;
	int t = n%10;
	n = n/10;
	int h = n;
	int rev = u*100+t*10+h;
	System.out.println("reverse number is" +rev);
	}
	
}


	
