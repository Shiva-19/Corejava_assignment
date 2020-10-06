//Q36//

class MathOperation{
		static void multiply(int a , int b){
	
			int c = a*b;
			System.out.println( "multiplication is " +c);
		}
		static float multiply(float a , float b, float c ){
			float d = a*b*c;
			System.out.println( "multiplication is " +c);
		}
		static void multiply( int arr[]){
			int mul=1;
		for(int i=0;i<arr.length;i++)
		 {
			mul=mul*arr[i];
		 }
		 System.out.println("multiplication is" +mul);
		}
		
		static void multiply( double x , int y){
			double z = x*y;
		   System.out.println("multiplication is " +z);
		}
     
 }



class MainDemo{
		public static void main(String args[]){
		
		MathOperation.multiply(5,10);
		MathOperation.multiply(2.3f,1.5f,3.4f);
		int arr[] = {5,10,15,20};
		MathOperation.multiply(arr);
		MathOperation.multiply(55,50);
		}
	}
