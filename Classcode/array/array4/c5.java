// 25/04/2023
//
// passing arrgument to an array

class c5{

	static void fun(int xarr[] ){
	
		System.out.println("in fun");

		for(int x : xarr){
		
			System.out.println(x);
		
		}
	
	}

	public static void main(String[] boss) {
	

		int arr[] = {10,20,30,40};
	
		System.out.println("in main");
		for (int x :arr){
		
			System.out.println(x);
		}
	
		fun(arr);
	
	}


}
