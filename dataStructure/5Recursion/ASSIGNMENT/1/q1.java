


//Solve using For loop and then convert it into a recursion approach.
/*1. WAP to print the numbers between 1 to 10.*/


class Rec{

	void usingFor(int num){
	
		for(int i = 1;i<=num;i++){
		
			System.out.println(i);
		
		}
	
	}

	 int i =1;
	void usingRec(int num){
	
		System.out.println(i++);
		if (num ==1)
			return;

		usingRec(--num);
	}

	public static void main(String[] boss){
		
		int num = 10;
		Rec obj =new Rec();

		//using for
		obj.usingFor(num);

		System.out.println();		
		//using recursion
		obj.usingRec(num);
	
	}


}
