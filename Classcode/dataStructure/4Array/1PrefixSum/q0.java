

//#1.prefix sum :


import java.util.*;

class ArrayDemo{
	public static void main(String[] boss){
	int arr[] = new int[]{2,5,3,11,7,9,4};
	int N=arr.length;
	int sum = 0;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter range  upto 0 to"+N+" \n fist element : ");
	int f = sc.nextInt();
	System.out.println("second element : ");
	int l = sc.nextInt();
	for(int i = f;i <=l;i++){
	
		sum = sum + arr[i] ;
	}
	
	System.out.println("sum of range " + f + " to "+l +" : "+ sum);
	}
	
}
