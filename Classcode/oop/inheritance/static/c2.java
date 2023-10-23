

class parent{

	static int x =10;

	static {
	
		System.out.println("in parent static block");
	}
	static void access(){
	
		System.out.println(x);
	
	}
}

class child extends parent{


	static {
	
		System.out.println("in child static block");
		System.out.println(x);
		access();  //access method is not present in child class but this is accesible for child class
	}
}

class client{

	public static void main(String[] boss){
	
		System.out.println("in main");
		child obj = new child();    //here child(obj);
	       
					   //as we createtd the object then impictly  call to constor of that parent class 
					  //--the the satic block of parent class is printed and then its return to chaild construtor then the static block of chaild is exucuted
					  //
	
	}


}
