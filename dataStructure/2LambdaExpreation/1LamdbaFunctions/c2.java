interface Demo{
	void gun();
       	/*Demo(){ 
		System.out.println("in demo constructor");
       	}*/
}
class user{ 

	public static void main(String[] boss){ 
		
		Demo obj = new Demo(){

		       public void gun(){ 
				System.out.println("in anonymous inner class : user$1"); 
				System.out.println("chek the no of .class file that is 3");
		       	} 
			
	       	};

		obj.gun();
       	}
} 
