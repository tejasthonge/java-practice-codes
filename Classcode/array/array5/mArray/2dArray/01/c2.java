//2d array are also wrinten in follow hard code way 
// jaggedArray  are also written in following way by varing no row and collams 
//

class c2{


	public static void main(String[] boss){
	
	
		int arr[][] ={{},{}};           //size=row=2  //no  of collames are not decleare but not give error
	        int arr1[][] ={{},{},{},{}};	//size=row=4
	
			
		System.out.println(arr.length);
		System.out.println(arr1.length);



		int arr2[][] = {{2,4,6},{8,10,20},{22,24,26}}; // this is hard coded way to write 2d array

		System.out.println(arr2.length) ;   //this is maina lenth or size of 2dArray its size depends on now row in 2dArray

	         System.out.println(arr2[0].length);   //it print size of 1st 1d array and denoded by arr2[0] 
		 System.out.println(arr2[1].length);   //it print size of 2st 1d array and denoded by arr2[1] 
	         System.out.println(arr2[2].length);   //it print size of 3st 1d array and denoded by arr2[2]
 		
		 //above 1d arrays combinetion is callad 2dArray
	}


}
