


class diffence{

	int mCount(int c){
	
		System.out.println(c);
		return c;
	
	}

	

      /*char mCout(char roman){
	
		System.out.println("char "+roman);

		return roman;
	
	
	}*/

	double mCount(double dd)
	
	{
	
		System.out.println("double shift "+dd);
		return dd;		
	}




	float per(int air,float bsf){
	
		float p =air +bsf;
	
		System.out.println("compare air vs bsf miletry per "+p);
		return p;
	}

	float per(float air,int para){
	
		float p= air + para;
		System.out.println("compare air vs para "+ p);
		return p;


	}



	public static void main(String[] boss)
	{

		diffence ind = new diffence();
		ind.mCount('Z');
		ind.mCount(2.2);



		ind.per(80,20);


		/*
		 error: reference to per is ambiguous
		ind.per(80,65);
		   ^
                both method per(int,float) in diffence and method per(float,int) in diffence match
                1 error

		 * /
	
	}

}

