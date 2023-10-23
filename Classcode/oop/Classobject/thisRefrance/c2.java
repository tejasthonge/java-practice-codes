

class Demo{

	Demo(){
	
		System.out.println("in no arg-constructor");
	
	}

	Demo(int x){

	
	
		System.out.println("in parametorais constructor");
	
	
	}

	public static void main(String[] boss){
	
		Demo obj1 = new Demo();     //implicitaly call to no-argument constructor
		Demo obj2 = new Demo(10);  //implicity call to parametories constructor
	
	
	}
}

