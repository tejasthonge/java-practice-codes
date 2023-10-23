//output:
//
//14 15 16 17 
//15 16 17 18 
//16 17 18 19
//17 18 19 20
//
//
//
class p3{

	public static void main(String[] boss){
		 
		int n = 14;

		for (int i = 1 ; i<= 4 ; i++){
		
			for(int j =1 ; j <=4 ; j++){
			
				if(i==1)System.out.print(n++ + " " );
			     else if(i==2)System.out.print((n++ - 3)+" ");
			        else if(i==3){
					System.out.print((n - 3) + " " );
					n++;
				}
				else if(i==4)System.out.print((n++ -3) + " " );
			}

		System.out.println();
		}
	
	
	}




}
