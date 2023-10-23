//A  b  C  d 
//E  f  G  h
//I  j  K  l
//M  n  O  p
//
//
//
class q8{
  public static void main(String[] boss ){
  	char cap = 'A';
	char small = 'a';


	for(int i = 1; i <=4; i++){
		for(int j =1 ; j<=4; j++){
		if(j%2==1){
			System.out.print((cap++)+("  "));
			small++;
		}
		else{
		System.out.print((small++)+("  "));
		cap++;
		}
		
		}
		
		
	System.out.println();
	}
  
  
  }




}
