/*
 *Q4.print the collum wise sum of the matrix
 */

class twoD{

	
	public static void main(String[] boss){
	
		int arr[][] = new int[][]{{2,4,6,8},{3,6,9,12},{4,8,12,16}};

		for(int i =0;i<arr[0].length;i++){
		
			int sum=0;
			for(int j=0;j<arr.length;j++){
			
				sum += arr[j][i];
			}
			System.out.println("sum of "+i+"th collum is : "+sum);
		
		}
	}

}
