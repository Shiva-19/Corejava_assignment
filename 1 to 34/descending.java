import java.util.Scanner;
class descending{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		int len =arr.length;
		//System.out.println(len);
		int arr1[]=new int[len];
		for(int i=0;i<=len;i++){
			arr1[len-1]=arr[i];
			len=len-1;
		}
		System.out.println("Reverse array");
		for(int a :arr1){
			System.out.print(a);	
		}
	}	
}
