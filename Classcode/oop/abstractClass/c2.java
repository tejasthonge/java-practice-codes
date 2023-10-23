abstract class parent{

	void carrear(){
	
		System.out.println("Doctor");
	
	}

	abstract void marry();  //if we write abstract method then the child class must have give them body 
				

}


class child extends parent{


	void marry(){
	
		System.out.println("Mus(~_-)");
	
	}

}


class client{

	public static void main(String[] boss){
	
		//here we we not creat abstract class object
		//but we use this as refarance

		parent obj = new child();
		obj.marry();
	
	
	}


}
