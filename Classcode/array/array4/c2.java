// 25-04-2023
// passing the argument to the function 
//--if return type is void the we can not write 'return' 
//--to return the value we must have to return type that is --> int , char , float ,etc
//--if we have to print the ruturn then we have to create a variable or we have write the fun in main method in betten of System.out.println(____);  <--
//--if their is no parameter or we write function in bettwen the sop then it gives error-->'void' type not allowed here



class c2{
	static void fun1(int x, int y)
	{
	
		int z= x+y;
		//--if return type is void the we can not write 'return'
//--to return the value we must have to return type that is --> int , char , float ,et
	//	return z;   

		System.out.println(z);
	
	}
	
	public static void main(String[] boss){
	
		fun1(2,2);
	//	System.out.println(fun1(2,4));  //error -->'void' type not allowed here
	
	
	
	}





}
