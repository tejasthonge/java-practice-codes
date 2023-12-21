//5QuickSort


import java.util.Arrays;
class QuickSort{


	

		void quickSort(int arr[],int start,int end){
		
			if(start < end){
			
				int piovtIndx = partion(arr,start,end);
				quickSort(arr,start,piovtIndx-1);
				quickSort(arr,piovtIndx+1,end);
			
			}
		}
		int partion(int arr[] ,int start,int end){
		
			int piovt = arr[end];

			int i = start -1;

			for(int j = start;j<end;j++){
			
				if(arr[j]<=piovt){
				i++;
				int temp = arr[i];
				arr[i]   = arr[j];
				arr[j]   = temp;
				}
			
			}
			int temp = arr[i+1];
			arr[i+1]= arr[end];
			arr[end] = temp;
			return i+1;
		
		}
		
		public static void main(String[] boss){
		QuickSort obj = new QuickSort();

		int[] arr = new int[]{12,7,6,14,5,15,10};

		int start = 0;
		int end = arr.length-1;

		obj.quickSort(arr,start,end);

		System.out.println(Arrays.toString(arr));
	
	}

}
