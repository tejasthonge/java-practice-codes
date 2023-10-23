/*Program 2
WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99*/



import java.util.*;


class p2{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Eneter the size of an array:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("enter "+size+" element");
		for(int i = 0;i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		      

		}
		System.out.print("the element in array is:");
		for (int i= 0; i<size ;i++){
		
			System.out.print(arr[i]);
		}
	
		int product = 1;
		System.out.println();
		for(int i= 0 ;i<size; i++){
		
			if(arr[i]%2==0){
			product = product*arr[i];
			
			
			}


		
		}
		System.out.println("the prodoct of even no is:"+product);
	}

}
