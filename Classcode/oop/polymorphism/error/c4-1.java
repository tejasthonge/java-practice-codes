

class demo{

	void fun(String str){
	
		System.out.println("In String");
	
	}

	void fun(StringBuffer sb){
	
		System.out.println("In StringBuffer");
	
	}
	public static void main(String[] boss){
	
	
		demo obj = new demo();
		obj.fun("boss");
		obj.fun(new StringBuffer("amar"));
	
		//above their is no ambibute but in bellow
	

		obj.fun(null);
	
	}


}

/*

 error: reference to fun is ambiguous
		obj.fun(null);
		   ^
  both method fun(String) in demo and method fun(StringBuffer) in demo match
1 error
error: compilation failed

 */
