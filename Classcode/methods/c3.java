import java.util.*;

//by using an object

class c3{


         void Countd(int x){
		int count =0;
		for (int i = 1 ; x!=0 ;i++){
			x= x/10;
	        	count++;
		}
        	System.out.println(count);

	
	}

	
	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("eneter the that you have count the diget:");
		int a=sc.nextInt();
		System.out.print("digit=");
	       c3 cl = new c3(); 
          	       
   		cl.Countd(a);
	
	
	
	}






}
