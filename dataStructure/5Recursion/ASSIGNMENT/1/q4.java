
//4. WAP to print the length of digits in a number.


class Rec{

	int usingFor(int num ){
	
		int count =0; 
		while(num!=0){
		
			count++;
			num/=10;

		}
		return count;

	}

	int count =0;
	int usingRec(int num){
		
		

		if(num ==0)
			return 0;
		count++;
		usingRec(num/=10);
		return count;
	}


	public static void main(String[] boss){
	
		int num =2321932;

		Rec obj = new Rec();
		

		
		//using for
		int ret1 = obj.usingFor(num);

		System.out.println(ret1);
	
		//using rec
		int ret2 = obj.usingRec(num);
		System.out.println(ret2);
	}

}
