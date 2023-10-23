interface Demo1{

	static void m1(){
	
		System.out.println("in demo1 m1");
	}
}
interface Demo2{
	static void m1(){
	System.out.println("in demo2 m1");

	}
}

class DemoChild implements Demo1,Demo2{

}


class user{

	public static void main(String[] boss){
	
		//if we call the m1 method using object this is not possible 
	
		DemoChild obj = new DemoChild();
	//	obj.m1();    //error : can not find symbol 

		//to accses the m1 or m2 we have given only  refarace of that interface

		Demo1.m1();   //it call m1 present in Demo1
	
		Demo2.m1();   //it call m1 present in Demo2	
	}
}

