//
//
//we can not use non static fun in static method main 
//
//their are two to handle this
//1. make fun static 
//2. make an object
//
//
//this show in c2 or c3


class c1{

       void add(int x , int y){
	
		int add = x +y;
		System.out.println(add);
	
	}

	public static void main (String[] boss){
	

		add(3,4);
	
	
	
	}



}
