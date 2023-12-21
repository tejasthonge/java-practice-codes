
//BubbleSort using recartion

class BubbleSortRec{
	int count=0;


	int j =0;

	boolean flag= false;
	int[] bubbleSort(int arr[] ,int len){
	
		

		if(len ==1)
			return arr;

		for(int i=0;i<len-1;i++){

			count++;
			if(arr[i]> arr[i+1]){

				flag = true;
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;

			
			}
		}
		if(flag == false)
			return arr;

		
		return bubbleSort(arr,len-1);
	
	}

	public static void main(String[] boss){
	
	//	int arr[] = new int[]{7,3,9,4,2,5,6};
		int arr[] = new int[]{1,2,3,4,5,6,7};
		int n = arr.length;

		BubbleSortRec obj = new BubbleSortRec();
		int[] ret = obj.bubbleSort(arr ,n);

		for(int i = 0;i<n;i++){
		
			System.out.print(ret[i] + " ");
		}

		System.out.println();
		System.out.println(obj.count);
	
	}


}
