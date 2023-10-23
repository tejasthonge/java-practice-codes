//F
//E  1 
//D  2  E
//C  3  D  4
//B  5  C  6  D
//A  7  B  8  C  9
//
//
//
//
//
class q7{

	public static void main(String[] boss){
	
		int a1 = 1;
		char ch1 = 'F';

		for (int i=1 ;i<=6; i++){
		
			int a2 =a1;
			char ch2 = ch1;


			for(int j = 1; j<=i ; j++){
			if(j%2==1){

			System.out.print((ch2++)+("   "));
			
			
			
			
			}
			else{
			
			System.out.print((a2++)+("  "));
			a1++;
			}
			
			}
	
		ch1--;
		System.out.println();
		
		
		}
	
	
	
	}
	
	
	
	
	


}
