//reverse array element
//N=7;
//TC O(N)
//SC O(N)


class ArrayReverse{

	public static void main(String[] boss){
	
	int arr[] = new int[]{7,6,5,4,3,2,1};
	
	int N =arr.length;
	int Arr[] = new int[N];
	for(int i =0;i<N;i++){
		Arr[i]= arr[i];

	
	}
	for(int i = N-1;i>=0;i--){
		System.out.print(Arr[i] + " ");	
	}
	System.out.println("");
	}

}
