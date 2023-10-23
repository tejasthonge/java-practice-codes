//18 jully
//  Exception in thread "main" java.lang.StackOverflowError




class stackDemo{

	static void fun(int x){
	
		System.out.println(x);
	
		fun(++x);//recursiv call: the function call it self 
	};

	public static void main(String[] boss){
	
		fun(1);

	
	}



}


//op-->
//Exception in thread "main" java.lang.StackOverflowError

