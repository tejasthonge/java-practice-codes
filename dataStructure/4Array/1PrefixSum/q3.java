

//Given an Array A or N integer 
//-construct prefi sum of array in the array itself
//-return an array of intergers denoting the prefix sum of given array
//
//problem construtor 
//1<=N=10^5;
//1<=a[i]<=10^3
//
//Example Input
//input 1  :
//a:[1,2,3,4,5];
//
//output
//a:[1,3,6,10,15]


class prefix_sum{

	public static void main(String[] boss){
	
		int arr[] = new int[]{1,2,3,4,5};
		int N = arr.length;
		int temp = 0;
		if(arr[0]==arr[0])

		for(int i =1;i<N;i++){
			arr[i] =arr[i] +arr[i-1];
		}
		for(int i =0;i<N;i++){
		System.out.println(arr[i]);
		}

	
	}



}
