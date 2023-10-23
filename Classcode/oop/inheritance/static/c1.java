//inheritance:satic membars:-->
//
//--it is real tyme entity that inaherit the parent class property/method /variable to tha child class
//--but chaid property is not accesible for parent 
//--as we create the object impictaly call to the constrar of that class hows object is created but in this constructr have the first line is invokespecial that is supar calling to constrtuctar that parent class




class parent{

	static{
	
		System.out.println("in parent static block");
	
	}
}

class child extends parent{

	static {
	
		System.out.println("in chaid static block");
	
	}
}

class client{

	public static void main(String[] boss){
	
		child obj = new child() ;  
	
	
	}



}
