/*
 
   Q1.problem Describe:

   	-you are given an array A of integer
	-you have to find equlibrium index of an arry
	-
	
	arr[] : [-7,1,5,2,-4,3,0];
   */
	/*
	Equlibrim index: the sum of left side and right side elemt is equle
	 */
//optimize approch
//TC O(N)
	
class eqindex{

	public static void main(String[] boss){
	
		int arr[] = new int[]{-7,1,5,2,-4,3,0};
		int N=arr.length;
		int eqArray[] = new int[N];
		int prefixSum =0;
		for(int i=0;i<N;i++){
			prefixSum =prefixSum + arr[i];
			eqArray[i] =prefixSum;
		}
	
		int lSum =0;
		int rSum=0;
		for(int i=1 ;i<N;i++){
			lSum= eqArray[i-1];
			rSum=eqArray[N-1] -eqArray[i];
			if(lSum==rSum){
				System.out.println(i);
				break;
			
			}
		}
	}

}

