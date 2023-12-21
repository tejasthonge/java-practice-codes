//2d way of to write jaggedArray:

class c4{

	public static void main(String[] boss){
	
		int arr[][] = new int[4][];

		arr[0] = new int[]{10,20,30,'A'};
		arr[1] = new int[]{40,50,'B'};
		arr[2] = new int[]{70,'C'};
		arr[3] = new int[] {'D'};
		System.out.println("the lenth or no. of row in jagged array : "+arr.length);

	
		for(int[] x: arr){
			for(int y:x){
			System.out.print(y+" ");
			}
		System.out.println();}
	}
}
