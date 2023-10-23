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
//brutch force approch
//TC O(NN)
	
class eqindex{

	public static void main(String[] boss){
	
		int arr[] = new int[]{-7,1,5,2,-4,3,0};
		int N=arr.length;

		for(int i=0;i<N;i++){
			int sumL=0;
			int sumR=0;
			for(int j=0;j<i;j++){
				
				sumL = sumL+arr[j];
			}
			for(int k= i+1;k<N;k++){
				
				sumR =sumR+arr[k];
					
			}
			if(sumL==sumR){
				System.out.println(arr[i]);
				break;
			}

		
		}
	
	}

}

