
//print the count of the subarry  whose length is 4
//l=4;
//op:7
class x{


	static int subArrayCount(int[] arr,int k){
	
		int N = arr.length;
		int count =0;
		int start = 0;
		int end = k-1;
		while(end<arr.length){
			
		end++;
		start++;
		k++;
		count++;
		
		}
		return count;
	}

	public static void main(String[] boss){
	
		int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		int k = 4;
		int ret=x.subArrayCount(arr,k);
		System.out.println(ret);

	
	}

}



