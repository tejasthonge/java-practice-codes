/*
 * given an array of size N 
 * and print each  subarray sum of 
 * length k=4;
 *
 * input : arr[] {-3,4,-2,5,3,-2,8,2,1,4}
 * op : 
 */

class x{

	public static void main(String[] boss){
	
		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		int N= arr.length;

		int k= 4;
		int start=0;
		int end=k-1;

		while(end<arr.length){
		
			int sum =0;
			for(int i =start;i<=end;i++){
			
				sum +=arr[i];
			}
			System.out.println(sum);
			k++;
			start++;
			end++;
		}
	
	}

}
