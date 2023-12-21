//Interface :  100% abstract class are wreten as interface reflesing the class key word
//
//--the diffarance is their is no constructor paresent is interface
//--this is also class check the byte code of interface
//--we cant create object of interface as like abstract class
//--we cant write any method with body 
//--afater 1.7 or in  1.8 java version  thir are same changes
//--thes interface is devoloped by java for mulple inheriace
//--that is one child class having more than two parent class
//--that is not persent in class
//--class is inherte by "extends" key word 
//--but interface is inherite by "implements" key word
//--afater 1.7 that is 1.8
//--we write method with body by using "static" or "defaolt" key word
//--this two is not same as paublic static void main(String[] boss) this static is defferent 
//--or we same method are defalt but we cant write as defaot the compiler atomaticly make them defoalt 
//--all the method write in interface are public abstract
//--but we dont requre to write them manuly compiler atomatecly add them



interface Demo{


	void fun();   //its actuly public private
	void gun();   //its actuly public private

}

class DemoChild implements Demo{

	public void fun(){  //here we must have write the public the reson is we can not minimize scope of overide method so we know the method is public then we write
   	
		System.out.println("in fun");
	
	}

	public void gun(){
	
		System.out.println("in gun");
	
	}

}

class client{

	public static void main(String[] boss){


		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	
	}

}
