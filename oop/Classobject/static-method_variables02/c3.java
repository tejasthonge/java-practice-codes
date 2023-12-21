class  demo {

	int x=  10;
	static int y =20;
	
	void fun1(){
	
		System.out.println(x);
		System.out.println(y);
	}
	
	static void fun2(){
	
		System.out.println(y); //we know only x is not acceseable it is non satatic we have createan object to accessec the x
				       //
	}

}

class client{

	public static void main(String[] boss){
		
		demo obj= new demo();

		obj.fun1();
		obj.fun2();

		System.out.println(obj.x);
		System.out.println(demo.y);  // y  is static so we can access by class name


	}

}
