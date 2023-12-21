


class BubbleSort{
	int count=0;
	int[] bubbleSort(int arr[]){
	
		
		int n = arr.length;

		int temp ;
		for(int i =0;i<n;i++){
		
			for(int j=0;j<n -1;j++){
			 	count++;
				if(arr[j]>arr[j+1]){
								
					temp = arr[j];
					arr[j] = arr[j+1];
				       	arr[j+1] = temp;	
				}
			
			}
		
		}
	
		return arr;
	}

	public static void main(String[] arg){
	
		int arr[] = new int[]{7,3,9,4,2,5,6};

		int n = arr.length;

		BubbleSort obj = new BubbleSort();
		int[] ret = obj.bubbleSort(arr);

		for(int i = 0;i<n;i++){
		
			System.out.print(ret[i] + " ");
		}

		System.out.println();
		System.out.println(obj.count);
	
	}


}
