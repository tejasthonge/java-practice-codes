class c2{

	public static void main(String[] boss){
	
		int arr[][] = {{1,2,3},{4,5},{7}};

		for (int i =0;i<3;i++){for(int j=0 ; j<3;j++){
		
			System.out.print(arr[i][j]+" ");  //it gives exeption that is array index out of bond
							  //tht mens the actul westing of storeg is resule
							  //by using jagged array 
		}
		System.out.println();
		}
	}
}
//this hard coded value give exeption
// to resolve above type of exeption we can use 
// .lenth methode
// for 2dArray we use arr.length
// for 1dArray we use arr[i].lenth it is 0th index elemet is nohtingbut 1dArray as like... 
