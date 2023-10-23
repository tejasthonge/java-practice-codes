
//given an array of size N we have find max no up to i
//arr:[3,4,5,1,2,7,9,8]
//i =3

class ArraDemo{

	public static void main(String[] boss){
	
		int arr[] = new int[]{3,4,5,1,2,7,9,8};

		int i =3;
		int Max_Num =Integer.MIN_VALUE;
		for(int j = 0;j<=i;j++){
			if(Max_Num < arr[j]){
				Max_Num = arr[j];}	
	
		}
		System.out.println(Max_Num);
	
	}


}
