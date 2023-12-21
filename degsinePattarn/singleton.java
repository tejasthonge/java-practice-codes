


class SingleTon{


	static SingleTon obj = new SingleTon();
	private SingleTon(){
	
		System.out.println("in constructor");
	
	}

	static SingleTon getObject(){  //static method having return typeSingleTon that is class name
	
		return obj;
	
	}
}


class client{

	public static void main(String[] boss){
	
		SingleTon obj1 = SingleTon.getObject();
		System.out.println(obj1);
	
		SingleTon obj2 = SingleTon.getObject();
		System.out.println(obj2);

		SingleTon obj3 = SingleTon.getObject();
		System.out.println(obj3);
	
	
	}
}

/*
o/p: 
in constructor
SingleTon@251a69d7
SingleTon@251a69d7
SingleTon@251a69d7

 */

//the addres or refarance of all the obj1 , obj2 or obj3 is same the reson is we only create once the object and affeter juct call them
//
