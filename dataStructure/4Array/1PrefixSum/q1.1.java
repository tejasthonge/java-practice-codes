//by using prefix sum
//time comp O(N)

import java.util.*;

class ArrayPrefixSum{


	public static void main(String[] boss){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1 };
		
		int N = arr.length;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the of qures Q: ");
		int Q = sc.nextInt();

		int preArray[] = new int[N];
		preArray[0] = arr[0];
	
		for(int i= 1; i<N;i++){
		
			preArray[i] = preArray[i-1] + arr[i]; 
		}

		
		for(int i = 1 ; i<=Q;i++){
			int sum=0;
			System.out.println("enter the starting no : ");
			int f = sc.nextInt();
			System.out.println("enter the ending no : ");
			int l = sc.nextInt();
			
			sum = preArray[l] - preArray[f-1];
							
			System.out.println("the sum of range "+ f+" to " +l +" is : "+sum );
			}
	
		
		}
	}

