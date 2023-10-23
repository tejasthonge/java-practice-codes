class squreofdigit{
	public static void main(String[] boss){
	int  n = 941123;
	int temp;
	int squre;
	int i = 1;
	while(n!=0){
	
		temp = n%10;
		squre = temp*temp;
		System.out.println(squre);
		n= n/10;
	
	}
	
	}

}
