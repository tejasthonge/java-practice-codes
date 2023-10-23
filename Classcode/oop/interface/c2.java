
interface Demo{

	void fun();
	void gun();
}

abstract class DemoChild1 implements Demo{

	public void fun(){
	
		System.out.println("in fun");
	
	}

}   //if we create child class and we cant write the body of paraent class then we have to make the abstract class
    // the resion is the parent class abstact method is persent in child class so we have to either complete them or we make abstract them

class DemoChild2 extends DemoChild1{

	public void gun(){
	
		System.out.println("in gun");
	
	
	}

}

class client{

	public static void main(String[] boss){
	

	//	Demo obj1 = new  DemoChild1();  //this is can not be insteite that is abstract class can not be create object
	
		Demo obj2= new DemoChild2();
		obj2.fun();
		obj2.gun();


	
	
	}


}
