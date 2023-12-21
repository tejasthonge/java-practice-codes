import java.util.*;

class c2 {

	static void factoor(int a){
		int fact=1;
		int i;
		for ( i =1 ; i<a; i++){
		
		
	        fact =fact + fact*i;
	  

		}
	System.out.println(fact);

	
	
	}

	public static void main(String[] boss){
	
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the no= ");
		int a = sc.nextInt();	
		factoor(a);
	
	
	}






}
