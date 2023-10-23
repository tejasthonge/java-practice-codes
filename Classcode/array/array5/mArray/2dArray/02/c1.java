//28/04/2023


//jagged Array :


class c1{

	public static void main(String[] boss){
	
	
		int arr[][] = {{10,20,30},{40,50},{60}};

		for(int[] x:arr){
		
			for (int y:x){
			System.out.print(y+" ");
			}
		System.out.println();
		}
	
	
	
	
	}



}
//output:

//10 20 30 
//40 50
//60

//above type of 2dArray is known as jagged Array 
//the main difface normal 2dArray  or jagged Array is the varetion of size of each 1dArray 
//supose we created normal 3X3 2dArray and fill only abve element data the other element are by effolt zero that means memory is wested 
//output of normal 2dArray
//10 20 30 
//40 50 0
//60 0  0
//the above three zero are west the storge
//to avide the wast the storege this jagged array concept in bilt in java
//but in c or c++ this type of jagge array are not avelebe the resone is c or cpp give sequsely memore to the array 
//but in java array memory is in heap sction we know 2dArray is nething but combintion of mulltiple 1dArray 
//this 1dArray alose in hepa sction and gives refrance to 2dArray 
//due to this java memory manegmet this type of jagged array consept is do and useful for minimum use of memory
