import java.util.Scanner;
class Que7{
   public static void main(String args[]){

   float a, b, c, d,e;
   double sum,percentage;
   Scanner sc = new Scanner(System.in);


     System.out.println("Enter marks of 5 subjects:");
     a = sc.nextFloat();
     b = sc.nextFloat();
     c = sc.nextFloat();
     d = sc.nextFloat();
     e = sc.nextFloat();

   sum = a + b + c + d + e ;
    percentage = (sum / 500.0 ) * 100;

    System.out.println("Sum:" +sum);
     System.out.println("Percentage:" +percentage);

   }
}