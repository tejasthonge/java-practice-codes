//25-04-2023



class c4{


        static void fun(int x , int y){
	System.out.println("in function");
	System.out.println(x);
	System.out.println(y);	
	 x= x+100;
	 y= y+100;
	System.out.println(x);
	System.out.println(y);
	}

	public static void main(String[] boss){
	

		int x=10;
		int y=20;
		
		System.out.println("befor the fun");
		System.out.println(x);
		System.out.println(y);

	
		fun(x,y);

		System.out.println("affter the fun");
		System.out.println(x);
		System.out.println(y);
	
// cheak the output here x and y value in main is not change affter calling the fun
//--the resen is x and y scope but array argumet are changes 	
	
	}
}
