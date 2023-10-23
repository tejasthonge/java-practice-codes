//printing of jagged array by using for each loop



class c3{
	public static void main(String[] boss){
	
		int arr[][]={{100,200,300},{400,500},{100},};

		for(int[] x : arr){
		   for(int y:x){
		   System.out.print(y+" ");
		   }
		System.out.println();
		}
	
	}


}
