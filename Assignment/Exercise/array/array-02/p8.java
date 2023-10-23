/*
 Program 8
WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8
   */

class Arra{

	
	public static void main(String[] boss){
	
		int arr1[] = new int[]{1,2,3,5};
		int arr2[] = new int[]{2,1,9,8};

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
			if(arr1[i]!=arr2[j]){
				System.out.println(arr1[j]);
				continue;
			}
			}
		}

	}

}
