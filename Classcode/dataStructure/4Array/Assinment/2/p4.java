
/*
 
   Problem 4:
Given an array of positive integers nums and a positive integer target, return the minimal length
of a
subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
   */


class MS{

	public static void main(String[] boss){
	
		//int arr[] = new int[]{2,3,1,2,4,3};
		int arr[]= new int[]{1,4,4};
		int N=arr.length;
		int sum=0;
		int target = 4;
		int count = 0;
		int count1=0;
		int j=1;


		for(int i=0;i<N;i++){
		
			if(arr[i] == target){
				count++;
				System.out.print(count);
				break;
			}

			sum = sum +arr[i];
			
			if(j<N-1){
			if(arr[i] + arr[j]==target){
				count=count+2;
				System.out.println(count);
				break;
				}
			}

			arr[i]=sum;
			
		}

		for(int i=0;i<N;i++){
		
			count1++;
			if(arr[i]==target){
				System.out.println(count1);
			}
		
		}
	
	}

}
