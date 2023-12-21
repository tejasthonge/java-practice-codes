//Polymorphism:
//--if the method name is same with respect to differnt parametors
//--theis calld as ...
//01.overloding:  in same class it is overloding 
//02.overriding:  in diffarent class but having reletion of parent child then it is overriding



class Demo{


	void fun(int x){
		System.out.println(x);
	}
	void fun(float x){
	
		System.out.println(x);
	}

	void fun(Demo obj){
	
		System.out.println("in demo para");
		System.out.println(obj);
	}

	public static void main(String[] boss){
	
		Demo obj = new Demo();

		obj.fun(101);
		obj.fun(10.1f);
	
		Demo obj1=new Demo();
		obj1.fun(obj);
	}
}


/* output:-->
101
10.1
in demo para
Demo@7ad041f3
*/
