/*Program 3
WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6

output : 48
//2 * 4 *6 
*/



import java.util.*;


class p3{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();


		int arr[] = new int[size];

		System.out.println("enter the element in an array:");
		for(int i = 0 ;i<size;i++){
		
			arr[i] = sc.nextInt();

		
		}
	System.out.print("the element is : ");
		for (int i = 0 ; i<arr.length;i++){
		System.out.print(arr[i]);
		
		
		}
		System.out.println();
		
		int mul=1;
		for(int i=0  ;  i<=size;i++){
			if(i%2!=0)
		mul = mul *i;
		
		}
		System.out.println("the product of odd index is: "+mul);
	}







}




