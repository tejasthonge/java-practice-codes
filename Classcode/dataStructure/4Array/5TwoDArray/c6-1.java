/*Q6.given a squre matrix print all left digonal
 */


class LeftDigonal{

	public static void main(String[] boss){
	
		int arr[][] = new int[][]{{11,22,33,44},{55,66,77,88},{99,111,222,333}};

		for(int i= 0;i<arr.length;i++){
		
			for(int j = 0;j<=i;j++){
			
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		
		}
	
	}

}
