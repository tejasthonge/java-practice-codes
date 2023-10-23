
/*
 

   8] Even occurring elements
Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.
Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23
Example 2:
Input:
N=5
Arr[] = {23, 12, 56, 34, 32}
Output: -1
Explanation:
Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
0 ≤ Arr[i] ≤ 63
   */


class ArrayDemo{

	public static void main(String[] boss){
	
	
		int arr[] = new int[]{9, 12, 23, 10, 12, 12,15, 23, 14, 12, 15};
	//	int arr[] = new int[]{23, 12, 56, 34, 32};
		int N = arr.length;
		int count=0;
		int eN=0;
		int j=1;
		for(int i=0;i<N;i++){
			if(j<N-1){	
			if(arr[i]%2==0 && arr[i]==arr[j]){
				count += 2;
				eN=j;
			}
			}
			j++;
		}
		
		if(count==0){
			System.out.println("-1");
		}
		else{
		for(int i=eN;i<=eN+count;i++){

                        System.out.println(arr[i] + " ");
                }
		}

	
	}

}
