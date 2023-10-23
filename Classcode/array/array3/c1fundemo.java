

class c1fundemo{

	void fun(){
	
		System.out.println("in fun " );
	
	}
	public static void main (String[] boss){
	
	//	fun();   we can not accsese fun  becouse it is non static method or fun so we have to create the an object
	
		c1fundemo obj = new c1fundemo();
		obj.fun();
	
	
	
	}



}
