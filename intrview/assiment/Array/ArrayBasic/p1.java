/*
 * 1] Search an Element in an array
Given an integer array and another integer element. The task is to find if the given
element is present in the array or not.
Example 1:
Input:
n=4
arr[] = {1,2,3,4}
x=3
Output: 2
Explanation: There is one test case with an array as {1, 2, 3 4} and an
element to be searched as 3. Since 3 is present at index 2, output is 2.
*/

import java.util.*;

class FindElement{
	
	static void elementAt(int[] a , int e){
		
		for(int i = 0; i<a.length;i++){
			
			if(a[i] == e){
				System.out.println("the element "+e +"is present at "+i);
			}
			/*
			else{
				System.out.println("the elenent " +e +" is not present in array");
			}*/
		
		}
	
	}

	public static void main(String[] boss){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of arry :");
		int size= sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0 ;i<arr.length;i++){
			System.out.println("enter the " + i+"th element : ");
			arr[i] = sc.nextInt();
		
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		
		}
		System.out.println();		
	

		System.out.println("enter the element that you want find :");	
		int e =sc.nextInt();
		FindElement.elementAt(arr , e);
	
	}
}

/*


*/
