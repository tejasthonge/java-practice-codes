//2. WAP to display the first 10 natural numbers in reverse order.


class Rec{


	void usingFor(int num){
	
		for(int i = num ;i>0;i--){
		
			System.out.println(i);
		}
	}


	void usingRec(int num){
	
		if(num ==0)
			return;
		

		System.out.println(num);
		usingRec(--num);
	}

	public static void main(String[] boss){
	

	int num = 10;

	Rec obj = new Rec();
	//using for
	obj.usingFor(num);

	//using rec
	obj.usingRec(num);	
	
	}


}
