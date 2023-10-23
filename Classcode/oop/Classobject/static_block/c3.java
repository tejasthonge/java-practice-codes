class obj{


	int x = 10;
	static obj objt= new obj();
	static {
//	public obj objt1= new obj();  //we can not make object public that error:illegale start
	System.out.println(objt1.x);
	System.out.println(objt.x);
	
	}
	public static void main(String[] boss){
	
		System.out.println(objt1.x); //it gives error can not find symbole;
		   System.out.println(objt.x);		  
	
	}

	static {
	
		System.out.println(objt.x);
	}



}
