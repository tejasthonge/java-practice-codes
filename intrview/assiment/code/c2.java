import java.util.*;


class c1{


	public static void main(String[] boss){
	
		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<arr.length; i++){
			System.out.println("enter the " + i +" no index element");
		  arr[i]= sc.nextInt();
		}

		System.out.println("array element theat you enter as bellow");	
		for(int i =0; i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	
	
	}


}
