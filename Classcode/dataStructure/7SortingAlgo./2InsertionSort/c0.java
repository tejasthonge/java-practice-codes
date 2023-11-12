//Insertion sort using loop


class Insertionsort{



	int count=0;
	int[] insertionSort(int[] arr){
	
	
		

		for(int i =0;i<arr.length;i++){
			
			int ele = arr[i];

			int j= i-1;
			while(j>=0 && arr[j]> ele){
				count++;
				arr[j+1] = arr[j];
			       j--;	
			}
			arr[j+1] = ele;
		
		}
		return arr;
	
	}






	public static void main(String[] boss){
	


		int arr[] = new int[]{7,3,9,4,2,5,6};
		
		Insertionsort obj =new Insertionsort();

		int[] ret = obj.insertionSort(arr);

		for(int i =0;i<arr.length;i++){
		
			System.out.print(ret[i] + " ");
		
		}
	
		System.out.println();
		System.out.println(obj.count);
	
	}

}
