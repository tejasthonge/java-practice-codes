class Demo{


	int x =10;
	Demo(){
		this(10);
	
		System.out.println("in no-arg constructor");
	
	}
	Demo(int x){
		
		//	this();		
			System.out.println("in para-constructor");
		}
	
	
	
	public static void main(String[] boss){
	
		Demo obj =new Demo();
	
	
	}



}
