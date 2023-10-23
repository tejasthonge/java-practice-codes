

/*
 
6] Elements in the Range
Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
   */

import java.util.*;

class Range{


	static String range(int[] a , int f,int l){
		int no = (l-f ) +1;
		int count=0;
		for(int i =f;i<=l;i++){
			for(int j=0;j<a.length;j++)
			if(a[j]==i){
			count++;
			}
		}
		if(no==count){
		return "Yes";
		}
		else{
		return "no";
		}
		
	
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();

		int[] arr= new int[size];

		System.out.println("enter element : ");
		
		for(int i = 0 ;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		for(int i= 0;i<arr.length;i++){
	
			System.out.print(arr[i]);
		}

		System.out.println("enter the range\n lover bond: ");
		int l =sc.nextInt();
	
		System.out.print("upper bond: ");
		int u = sc.nextInt();

		String ret = Range.range(arr,l,u);
		System.out.println(ret);
	}
}
