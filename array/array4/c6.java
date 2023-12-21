//25-04-2023
//
//-their is java sack java heap in java method memory are push we we call the method or function
//-all the array elemet are store in heap or array addrese in java main stake 
//-in java main array addrese is store or the elemet is in heap and array are looking to the element present in heap with help of addres but we addres are note allows in java but the other consept is present that is 'class refrance' thes is like as addres in c lang


class c6{

	static void fun(int xarr[]){
	
		System.out.println("in fun");
		for (int x :xarr){
		
			System.out.println(x);
		
		}
		System.out.println("in fun by adding 100 in each element in array");
		for(int x :xarr){
		
			x=x+100;
			System.out.println(x);
		
		}

	}



	public static void main(String[] boss){
	
	
		int arr[] = {10,20, 30, 40};

		System.out.println("in main");

		for (int i = 0 ; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}
	
	       fun(arr);
	       System.out.println("in main after the fun calling");

	       for(int x : arr){
	       
		       System.out.println(x);
	       
	       }
	
	}

}
