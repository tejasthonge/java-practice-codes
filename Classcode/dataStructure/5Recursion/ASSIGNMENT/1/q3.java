

//3. WAP to print the sum of n natural numbers


class Rec{


	int usingFor(int num){
	
		int sum =0;

		for(int i = 1;i<=num;i++){
		
			sum +=i;
		}
		return sum;

	}

	int usingRec(int num){
	
		if(num==0)
			return 0;

		return num + usingRec(--num);
	
	}

	public static void main(String[] boss){
	
		int num = 5;

		Rec obj = new Rec();


		//using for
		int ret1 = obj.usingFor(num);
		System.out.println(ret1);
	
		//using rec
		int ret2 = obj.usingRec(num);
		System.out.println(ret2);
	}

}
