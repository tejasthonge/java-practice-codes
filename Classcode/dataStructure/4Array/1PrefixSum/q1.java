//given an array of size N and Q no of  quries 
//quries contain two paranetores 
//starting and ending index 
//
//for all element prin sum of all element bettece s to e 
//
//
//TC O(QN); linear time
//Sc O(1);constat space
//#1.prefix sum :


import java.util.*;

class ArrayDemo{
	public static void main(String[] boss){
	int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
	int N=arr.length;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of quries : " );
	
	int Q = sc.nextInt();
	int f=0;
	int l=0;
	for (int j = 1;j<=Q;j++){
		int sum =0;
		System.out.println("Enter range  upto 0 to"+N+" \n fist element : ");
		 f = sc.nextInt();
		
		System.out.println("second element : ");
		 l = sc.nextInt();

		for(int i = f;i <=l;i++){
	
			sum = sum + arr[i] ;

		}
		System.out.println("sum of range " + f + " to " + l + " : " + sum);

	}

	}
	
}
