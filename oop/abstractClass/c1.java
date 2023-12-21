//09-june-2023

//Abstract class

//--the class at least one abstract method 
//--the method does not have body is callad abstract method 
//--or all the abstract method start with abstract key word 
//--in abstract class concriete method also presnt
//--the method with body is know as concrieate method 
//--in abstract class 0% to 100% abstraction is present 
//


abstract class parent{

	void carrear(){     //this is concride method
	
		System.out.println("Doctor");
	
	
	}
	abstract void marry();  //this is abstract method

}

class client {


	public static void main(String[] boss){
	
		parent obj = new parent();   //we can not  create object of abstract class
					     //
					     //if any method is abstract in class we must have to make class abstrct
		
	}

}

/*
 c1.java:31: error: parent is abstract; cannot be instantiated
		parent obj = new parent();   //we can not  create object of abstract class
		             ^
1 error

 */
