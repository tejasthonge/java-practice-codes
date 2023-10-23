


/*
 	Program 9
Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array
 	
   */


class arrDemo{

	public static void main(String[] boss){
	
		int arr1[] = new int[]{10,20,30,40,50};
		int arr2[] = new int[]{9,18,27,36,45};
		
		int x = arr1.length + arr2.length;
		int[] murgeArr = new int[x];
		for(int i = 0; i<arr1.length;i++){
			murgeArr[i] = arr1[i];
	
		}
		int j=0;
		for(int i= arr1.length;i<x;i++){
			
			murgeArr[i] = arr2[j];
			j++;
		}

		
		for(int i =0;i<x;i++){
			System.out.print(murgeArr[i] +" ");
		}
	}


}
