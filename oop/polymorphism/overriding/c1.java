// overriding 
// --we in single class we cant write same methods having same method signeture
// --for this we have to create parent child reletionship bettwen two classes 
// --if some methods in parent class are not sutable to child class then child class rewrite or override parent class method this concept is known as overriding
// --only in parent child reretionship class have this type of concept


class parent {


	void fun(){
	
		System.out.println("in parent fun");
	
	}


}
class child extends parent {

	void fun(){
	
		System.out.println("in child fun");
	
		}
	void gun(){
	

		System.out.println("in child gun");
	
	}


}

class client {

	public static void main(String[] boss){
	

		child obj1 = new child();  //if we create child refarance child object then 
		obj1.fun();   //then child fun gives first priroty (mahatv)
			    
		parent obj2 = new parent(); //if we create parent refarance parent objet then only parent class method are accessesible or chaild class method not finds and gives can not find symbole error
		obj2.fun();

		parent obj3= new child();  //we know this is not wroin 
					   //--if we create parent refarance child objet then we know that this is also correct 
					   //--but we some method frome child this method must present in parent class
		obj3.fun();

		//obj3.gun();  //give error 
			     //--the resone is we create parent refarance object
			     //--the actuly what happan
			     //--at comple tyme parent class check the method table 
			     //--but we create parent refrance object then this time 
			     //--compier finds the gun() method in parent class but this is not presetn in parent class or we know child class method not accasseble for parent class due this theis it give error as can not find symbole
			     //--but we create child refarance object like obj1 it can be accaseeble

	
		obj1.gun();
	}


}
