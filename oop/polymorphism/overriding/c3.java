class parent {

	
	void fun(){
	
		System.out.println("in parent constructor");
	
	}

}


class child extends parent {



	void gun(){  //new child method not present in parent class
	
		System.out.println("in child gun");
	
	}
	
	void fun(){
	
		System.out.println("in child fun");
	
	}

}


class user{

	public static void main(String[] boss){
	
	
		child obc = new child();   //her child refaerance is child or object is also childs
					   //so compailer cheak this two method in child class and it finds no error
		obc.fun();
		obc.gun();  

		parent obj = new child();  //her the parents refarance and childs object is crreated so it compiler find the bellow two method
		obj.fun();
		obj.gun();   //but this method is not preset in method tabale of parent so it gives error

		
	
	
	}

}
