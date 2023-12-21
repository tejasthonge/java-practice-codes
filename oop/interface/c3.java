


//Multiple inheritace in java 
//--this is solved by interface


interface Demo1{


	void fun();


}

interface Demo2{

	void fun();

}

class DemoChild implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("in fun");
	
	}

}

class client{

	public static void main(String[] boss){
	
		DemoChild obj = new  DemoChild();
		obj.fun();  //here we call to fun but in parent interface Demo1 or Demo2 have fun method but this is incomplet so compiletion time theire is no proble we we gives body to fun in child class so it run
	
	}

}
