/* 
Program 4
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
  */

import java.util.*;
class ArrayDemo{


	public static void main(String[] boss){
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[]{1,2,4,5,6};
		System.out.println("enter the element");	
		int e =sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==e){
				System.out.println("elment " + e+ " is at intdex "+ i);
			}

		}
		



	}
}

