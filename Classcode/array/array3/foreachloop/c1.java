

class c1 {

	public static void main (String[] boss){
	

		int arr[] = {13,24,22,43};

	System.out.println("1st for each loop x is int");
		for(int x: arr){
		
			System.out.println(x);
			if(x<arr.length){
			System.out.println(arr[x]);  //their is no output thet mens x is nething bot arr[x]  ie x= arr[x]
			}
		
		}
		
	System.out.println("2nd for each loop x is float ");
	         for(float x: arr){

                       System.out.println(x);

		 }

/*	System.out.println("3rd for each loop")	 ;
		for(char x : arr){  //due to char it give error that is possylossy convergen for int to char 
		
			System.out.println(x);
		
		}*/  
	

		System.out.println("identityHashCode of arr[] is:");
		System.out.println(System.identityHashCode(arr));
		System.out.println("the out put of the Sop(arr) is \n this 'I' is stand for integer arry" );
		System.out.println(arr);		
		
	}



}
