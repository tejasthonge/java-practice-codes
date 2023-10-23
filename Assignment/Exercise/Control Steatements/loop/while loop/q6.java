class sumofevenandodd{
	public static void main(String[] boss){
	int n = 30;
	int i = 1;
	int sumeven = 0;
	double mulodd = 1;
	while(i<=n){
		if (i%2==0){
		sumeven =sumeven + i;
		}
		else{
		    if(i<=10){
		    	mulodd = mulodd* i;

		    }
		}
		i++;
	}
	System.out.println("the sum even = " + sumeven); 
	System.out.println("the multificaron of odd 1 to 10 "+ mulodd);
	}
}
