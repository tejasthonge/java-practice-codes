
//no of itertion is decrresed due we not chek the last element the resion is

class BubbleSort{
	int count=0;
	int[] bubbleSort(int arr[]){
	
		
		int n = arr.length;

		int temp ;
		for(int i =0;i<n;i++){
		
			for(int j=0;(j<n-1-i);j++){
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
	
	//	int arr[] = new int[]{7,3,9,4,2,5,6};
		int arr[] = new int[]{2,4,8,10,12,13,16}; //but  for sorted arry itertion is same as above array
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
