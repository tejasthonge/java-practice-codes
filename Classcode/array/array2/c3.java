


class c3{

	public static void main(String[] boss){
	
	

		int arr1[] = {2,4,6,8,10};

		char arr2[] ={'A','B', 'C'};

		float arr3[] = {34.2f, 53.2f};

		boolean arr4[]={true ,false,true ,false};
	
	//array_name.length method to find the size of an array
	System.out.println("the legth of an arry is:"+ arr1.length);

	//accsesing an element by using for loop	

	System.out.println("the element in integer array is:");

        	for(int i =0 ; i<arr1.length;i++){
	
	        	System.out.println(arr1[i]);
        	}

	System.out.println("the element in charector array is:");
	        
	       for (int i = 0 ;i < arr2.length; i++){
	       
		       System.out.println(arr2[i]);
	       
	       }
	System.out.println("the element in float array is:");
		for(int i = 0 ; i<arr3.length; i++){
		
			System.out.println(arr3[i]);
		
		
		}
	System.out.println("the element in boolean array is:");	
		for(int i = 0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		
		}
	}






}
