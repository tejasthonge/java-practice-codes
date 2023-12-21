class Demo{

	static int bCount(int a ,int b){
		
		int count = 0;//

		for(int i =a;i<=b;i++){

			count++;
				
		}
		return count;
	
	}

	static int nnCount(int a , int b){

		int count = 0;

		count =  b - a + 1;	
		
		return count;
	
	}

	public static void main(String[] boss){
	
		int ret = bCount(4,9);
		System.out.println(ret);
			
		int ret1 = nnCount(4,9);	
		System.out.println(ret1);
	}

}
