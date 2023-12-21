/*
subarray: -all the ellemet in array also sub array of that arry
          - single element is also subarray
	  -but revese elemt is not sub are 
   */

/*
 
   q. given an A integer Array
   --find count of minimun sub array which contain min and max element

   arr[] = {1,2,3,1,3,4,6,4,6,3}
   OP: 4
   
 */

class SubArray{

	public static void main(String[] boss){
	
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};
		int minNo= Integer.MAX_VALUE;
		int maxNo= Integer.MIN_VALUE;
		int len = 0;
		int N= arr.length;
		int f;
		int l;
		for(int i= 0;i<N;i++){

			if(maxNo>arr[i])
				maxNo=arr[i];
				l=i;
		
			if(minNo>arr[i])
				minNo=arr[i];
				f=i;
		}
		int maxlen=Integer.MAX_VALUE;
		//int len = Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			if(arr[i] ==minNo ){
			
				for(int j= i+1;j<N;j++){
							
					if(arr[j] ==maxNo)
						len = j-i+1;
						break;
				
				}
				if(maxlen>len){
					maxlen = len;
				}
				System.out.println(maxlen);
			}

			else if(arr[i]== maxNo){
				
				for(int j = i+1 ;j<N;j++){
					
					if(arr[j]==minNo){
					
						len= j-i+1;
						break;
					}
				}
				if(maxlen>len){
				maxlen=len;
			
				}
				System.out.println(maxlen);
			}
		}
	}

}
