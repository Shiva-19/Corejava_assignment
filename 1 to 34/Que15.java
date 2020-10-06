import java.util.Scanner;
class Que15{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		System.out.println("Are you married? Y/N");
		int married = sc.next().charAt(0);
		
		if(sex == 'F') {
			if((age >= 18) && (age < 40)) {
				System.out.println("You are eligible for marriage");
			}
                  }
			
		
		
		if(sex == 'M') {
			if((age >= 18) && (age < 40)) {
				System.out.println("You are eligible for marriage");
			}
			
		}
	
	}
}