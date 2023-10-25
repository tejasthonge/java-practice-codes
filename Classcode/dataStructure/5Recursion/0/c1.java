

class recursion{

	//by using for
	void printNum(int num){
	
		for(int i=1;i<=num;i++){
		
			System.out.println(i);
		}
	}

	//by using recursion
	void recrsionPrint(int num){
	
		if(num==0)
			return ;
		System.out.println(num);
		recrsionPrint(--num);
	}
	
	public static void main(String[] boss){
	
		recursion obj = new recursion();

		obj.printNum(10);

		obj.recrsionPrint(10);

	
	}

}
