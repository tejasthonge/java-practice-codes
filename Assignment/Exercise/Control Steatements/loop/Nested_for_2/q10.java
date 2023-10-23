// F  5  D  3  B  1
// F  5  D  3  B  1
// F  5  D  3  B  1
// F  5  D  3  B  1
// F  5  D  3  B  1
// F  5  D  3  B  1


class q10{
	public static void main(String[] boss){
	

		for(int i = 1; i<= 6;i++){

			char ch = 'F';
			int k = 6;
			for(int j= 1; j<=6; j++){
				if(j%2==1){
				System.out.print((ch-- )+ ("  " ));
				k--;
				}
				else{
				System.out.print( ( k--) + ("  "));
				ch--;
				}
			
			}
		System.out.println();
		}
	
	}


}
