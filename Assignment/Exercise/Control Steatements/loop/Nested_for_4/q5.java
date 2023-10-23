 //A  B  C  D 
 //B  C  D
 //C  D
 //D
 //
 //
 //
 //
 

class q5
{



	public static void main(String[] boss){
		int n=4;
		char ch1  ='A';
		for(int i = 1;i<=4;i++){
			char ch2 =ch1;
			for(int j =1; j<=n;j++){
			System.out.print((ch2++ ) +("  "));
			
			
			
			}
			n--;
ch1++;
System.out.println();
		
		}
	
	
	
	
	}




}
