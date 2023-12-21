

//printin the sum of rage 
//


class Demo{

	int getSum(int range){
		
		if(range==0)
			return range;

		
		return range + getSum(--range);	
		 
	}

	int printSum(int num){
	
		int sum=0;

		for(int i =1;i<=num;i++){
		sum+=i;

		
		}
		return sum;
	
	}

	public static void main(String[] boss){
	
		Demo obj = new Demo();
		int ret =obj.getSum(10);
		System.out.println(ret);
		
		int ret1 = obj.printSum(10);
		System.out.println(ret1);


	
	}

}
