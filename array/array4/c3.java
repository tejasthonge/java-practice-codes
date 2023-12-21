class c3{

	static int sum(int x , int y){
	
		System.out.println("the same is :");
		return x+y;
	
	
	}
	public static void main(String[] boss){
	
		System.out.println("direct call wethot var or in bettewen of sop");
		sum(2,3);  //we call the sum fun but her only sop print but retrun is no print for this we have create an varebal of fun call in bettwen of sop as like as bellow
			  
		System.out.println("by using var");

		int a = sum(2,3);
		System.out.println(a);

		System.out.println("in bettewen sop(__)");
		System.out.println(sum('A',2));
	
	
	
	}



}
