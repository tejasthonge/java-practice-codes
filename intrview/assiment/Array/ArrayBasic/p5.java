/*

5] Replace all 0's with 5
You are given an integer N. You need to convert all zeros of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 10000 */

import java.util.*;

class Replace {
	static int count = 0;
	static int arr[] = new int[count] ; 

	static void convertArray(){
			
		for(int i= 0; i<arr.length;i++)	{
		
			if(arr[i] ==0)
				arr[i] = 5;
			
		}
	

		for(int i =0; i<arr.length; i++){
		
			System.out.print(arr[i]+" ");
		
		}
	}
	
	static void countDigit(int n){
		
		for(int i=1;n!=0;i++){
		
			n= n/10;
			count++;
		}
		
		//System.out.println(count);
	}
	static int temp = 0;
	static void rem(int n){
		
		for(int i =0 ; n!=0;i++){
		temp = n%10;
		n= n/10;
		if(i<arr.length){
		arr[i] = temp;
	
		}
		
		}

	
	}
	static void repales(int n){
	
		Replace.countDigit(n);
		Replace.rem(n);
		Replace.convertArray();

		

	
	}
	
	


	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("inter the Integer : ");
		int N = sc.nextInt();
		System.out.println("the no is 0s is replaced with 5 as bellow : ");
		Replace.repales(N);

	}

}

