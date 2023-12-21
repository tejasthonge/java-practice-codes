//After java 1.7 means in 1.8 we write Interface having concreate method (the method having body)
// for this java added two key word
// 1--->static
// 2--->default
//
//--this abvave have differnt meaning not same as regular static  

interface Demo{

	void fun();

	
	default void gun(){
	
		System.out.println("this is overrideble");
	}


	static void run(){

		System.out.println("this can not be overrideble or not inherite to chaild");

	}

}




/*
 
 if verdion is bellow 1.8 then it gives error


c1.java:2: error: class, interface, enum, or record expected
eate method (the method having body)
^
1 error
 

 */
