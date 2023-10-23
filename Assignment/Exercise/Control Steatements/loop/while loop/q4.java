class countodd
{ 
	public static void main(String[] boss){
	int n = 4333334;
        int i =1;
	int count =0;
        while(n!=0)
	{
	      int temp = n%10;;
		if (temp%2!=0){

		count++;
	
		}
	     	n = n/10;
	}		
      System.out.println(count);
}}
