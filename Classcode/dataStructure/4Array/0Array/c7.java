

class ArrayDemo{

	public static void main(String[] boss){

		int arr[] = new int[]{22,3,2,53,3,3};

		int N= arr.length;
		int j= N-1;
			
		for(int i = 0 ; i <=N/2;i++){
			
			if(i==j)
			System.out.println(arr[j]);
			
			else
			System.out.println(arr[i]+arr[j]);
			j--;
		}
	
	
	}

}
