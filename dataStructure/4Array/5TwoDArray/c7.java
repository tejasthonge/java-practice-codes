/*Q7.given a squre matrix print all left digonal
 */


class LeftDigonal{

	public static void main(String[] boss){
	
		int arr[][] = new int[][]{{11,22,33,44},{55,66,77,88},{99,111,222,333}};

		for(int i= 0;i<arr.length;i++){
			int k = arr[0].length-1 -i ;
			int l=k;
			for(int j = k;j>=l+i;j--){
			
				System.out.print(arr[i][j] +" ");
				k++;
			}
			System.out.println();
		
		}
	
	}

}
