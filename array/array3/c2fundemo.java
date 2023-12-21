
class c2fundemo{

	int sum(int x){
	
		int add = x + 60;
		System.out.println("the sum is :")	;
        	return add;
	
	}


	public static void main (String[] boss){
	
	        int a= 10 ;
//		int b= 20;
 
		c2fundemo obj= new c2fundemo();

//		int ret = obj.sum(a);
//	        System.out.println(ret);


		System.out.println(obj.sum(a));	

		obj.sum(a);  // at this time return value is not print only"in fun" is printing !why
	}


}
