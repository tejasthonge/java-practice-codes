/*
 Q5. In-place Prefix Sum
Problem Description
- Given an array A of N integers.
- Construct the prefix sum of the array in the given array itself.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 103
Example Input
Input 1:
A = [1, 2, 3, 4, 5]
Input 2:
A = [4, 3, 2]
Example Output
Output 1:
[1, 3, 6, 10, 15]
Output 2:
[4, 7, 9]
Example ExplanationExplanation 1:
The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
Explanation 2:
The prefix sum array of [4, 3, 2] is [4, 7, 9].
   */


class ArrayDemo{

	public static void main(String[] boss){
	
		//int A[] = new int[]{1, 2, 3, 4, 5};
		int A[] = new int[]{4,3,2};
		int N=A.length;
		int prefix_sum[] = new int[N];
		int sum = 0;
		for(int i= 0;i<N;i++){
			sum=sum + A[i];
			prefix_sum[i] =sum;
			System.out.print(sum + " ");	
		}
		
	
	}



}
