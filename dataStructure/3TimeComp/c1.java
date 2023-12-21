

//Time Complexibilty:
//	--find the  time requre for any forsses 
//	--it is proptional to no. of itreation
//	--
//


class Demo{
	
	static int nSum2(int n){
	
		int sum = 0;

		return (n*(n+1))/2;   //no of iteration is jaust one
	
	}
	static int nSum1(int n){
		int sum =0;	//constat
		for (int i = 1; i<=n;i++){   //no of iteretion 10
		sum = sum +i;
		}
		return sum;//constant
	
	}

	public static void main(String[] boss){
	
		int n =11;
		int ret = nSum1(n);
		System.out.println(ret);
	
		int ret1= nSum1(n);
		System.out.println(ret1);
	}

}


