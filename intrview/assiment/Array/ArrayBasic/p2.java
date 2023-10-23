/*
 2] Find minimum and maximum element in an array
Given an array A of size N of integers. Your task is to find the minimum and
maximum elements in the array.
Example 1:
Input:
N=6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
Example 2:
Input:
N=5
A[] = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum elements of array are 1 and 56789.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 10^5
1 <= Ai <=10^12
 
   
   
   */

import java.util.*;

class MaxMin{


	static String maxMin(int[] a){
		int max = a[0];
		int min = a[0];
		for(int i = 1 ;i<a.length;i++){
		
		
			
			if(max < a[i] ){
			max = a[i] ;
			} 
			else if(min > a[i]){
			min = a[i];
			}
		
		}
	return "minimum and maximaum no is " + min +" and "+max;
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");

		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i<arr.length;i++){
		
			System.out.print("enter the element :");
			arr[i] = sc.nextInt();
		
		}
		System.out.println();

		String ret=  MaxMin.maxMin(arr);
		System.out.println(ret);

	
	}
}


