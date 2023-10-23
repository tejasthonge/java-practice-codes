//F
//E F 
//D E F
//C D E F 
//B C D E F
//A B C D E F
//
//
 

class q7{
	public static void main(String[] boss){
	char ch = 'F';
		for (int i = 1;i <=6; i++){
		char ch2 = ch;
		
			for (int j = 1 ; j<= i; j++){
			System.out.print((ch2++) + ("  "));

			
			}
		
			ch--;
			
			System.out.println();
		}


	
	}



}
