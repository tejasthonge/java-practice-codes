//given an array of size N we have to reverse Array without using extra space
//SC O(i);


class ArrayReverse{

	public static void main(String[] boss){
	
	int arr[] =new int[]{4,3,2,1};
	int N = arr.length;
	int temp =0;
	int j =N-1;
	for(int i= 0;i<N/2;i++){
		if(i==j){
		arr[i]=arr[j];
		continue;
		}
		temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
		j--;
	}
	for(int i=0;i<N;i++){
		System.out.print(arr[i]+" ");
	}
	}

}
