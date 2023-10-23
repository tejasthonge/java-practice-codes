


class Rap{
	int rap = 0;
	int rem = 1;
	int n= 0;
	int rapleys(int n){
	while(n!=0){
	rem =n%10;
	if (rem ==0){
	rem =5;
	}
	rap = rem + rap*10;
	n =n/10;
	
	}
	int rat = reverse(rap);
	return rat;

	}

	int reverse( int rapp){
	int rem = 1;
	int rev=0;
	while(rapp!=0){
		rem = rapp%10;
		rev = rem +rev*10;
		rapp/=10;
	}
	return rev;
	}	


	public static void main(String[] boss){
	Rap obj = new Rap();
	int n=7000;
	System.out.println(n);
	int ret =obj.rapleys(n);
	System.out.println(ret);
	}
}
