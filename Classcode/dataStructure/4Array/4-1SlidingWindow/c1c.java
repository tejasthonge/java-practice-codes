/*
 * given an array of size N 
 * and find max  subarray sum of 
 * length k=4;
 *
 * input : arr[] {-3,4,-2,5,3,-2,8,2,1,4}
 * op :15 
 */
//TC O(N^2)

class x{

	public static void main(String[] boss){
	
		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		int N= arr.length;

		int k= 4;
		int start=0;
		int end=k-1;

		int maxSum = Integer.MIN_VALUE;
		while(end<arr.length){
		
			int sum =0;
			for(int i =start;i<=end;i++){
			
				sum +=arr[i];
			}
			if(sum>maxSum)
				maxSum=sum;

			k++;
			start++;
			end++;
		}
		System.out.println(maxSum);
	
	}

}
