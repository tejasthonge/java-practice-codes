//print second largert element in an Array having size N
//N =4
//arr[2,42,3,54];
//

class ArrayDemo{

	public static void main(String[] boss){
	
		int[] arr = new int[]{2,100,42,3,54};
		int N = arr.length;
		int maxElement = Integer.MIN_VALUE;

		int secondLarg = 0;
		for (int i=0;i<N;i++){

			if(arr[i]>maxElement){
			
			maxElement =arr[i];
			}
			secondLarg = maxElement;
			
		}
		System.out.print("second Largest element int array  : " + secondLarg);
	
	}

}
