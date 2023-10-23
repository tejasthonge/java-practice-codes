




class demo{


	void fun(int x,float z){
	
	
		System.out.println("in int-float para");
	
	}

	void fun(float x, int z){
	
		System.out.println("in float-int para");
	}

	public static void main(String[] boss){
	
		demo obj = new demo();
		obj.fun(10,20);
	
	}
}




/*
   error: reference to fun is ambiguous
		obj.fun(10,20);
		   ^
  both method fun(int,float) in demo and method fun(float,int) in demo match
   
 */
