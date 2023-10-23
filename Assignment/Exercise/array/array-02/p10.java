/*
 Program 10
WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123
 
   */


class ArrayDemo{

	public static void main(String[] boss){
	
		int arr[] = new int[]{1,2,3,5,15,16,14,28,17,29,123};
			int N= arr.length;
			for (int i = 0;i<N;i++){
			int f =0;
			int rem = arr[i] %10;
			if(arr[i]<100){
		         f = arr[i] /10;
			}
			if(arr[i]>=100){
				f= arr[i]/100;
			}
			if((rem + f) % 2 == 0){
				System.out.print(arr[i] + " ");
			}

		
		}
	}

}
