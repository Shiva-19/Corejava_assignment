import java.util.Scanner;
class Que24{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	for( int i=0;i < arr.length ; i++)
	{
		System.out.println("enter array elements");
		arr[i] = sc.nextInt();
	}
	System.out.println("enter element to be searched");
	int el = sc.nextInt();
	for( int i=0 ; i < arr.length ; i++)
	{
		if(arr[i]==el)
		{
			System.out.println(" no is found" +arr[i]);
		}
		
	}

  }
		