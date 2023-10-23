/*//re solve

   9] Remove an Element at Specific Index from an Array
Given an array of a fixed length. The task is to remove an element at a specific
index from the array.
Examples 1:
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }
Examples 2:
Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }
   */

class ArrayDemo{

	public static void main(String[] boss){
	
		int arr[] = new int[]{1,2,3,4,5,};
		int index = 2;
		int N= arr.length;
		int j=1;
		for(int i=0;i<N;i++){
			if(j<N-1){
			if(i==index){
				arr[i] =arr[j];
			}
			
			if(i>index){
				arr[i]=arr[j];
			}
			arr[N-1] =arr[N-1];
			}
			
		j++;
		}
		for(int i=0;i<N-1;i++){
			System.out.println(arr[i] +" ");
		}
	
	}


}
