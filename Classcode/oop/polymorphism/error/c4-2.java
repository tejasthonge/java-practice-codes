

class Demo{

	void fun(Object obj){
	
		System.out.println("in object para");
	
	}
	void fun(String str){
	
		System.out.println("in String para");
	
	}

	public static void main(String[] boss){
	
		Demo obj= new Demo();
		obj.fun("Amar_boss");
		obj.fun(new StringBuffer("boss"));
		obj.fun(null);   //her we parent are less  pirpriity as comapair to child so null is going towords the child that to in String chekc output 
				 //due to parent child realetion its not a ambobis bieaheawear
				 //(~_-)

	

	
	}



}
