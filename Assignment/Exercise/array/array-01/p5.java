/*Program 5
Write a program ,take 10 input from the user and print only elements that are divisible by
5.
Input: 10 2 2 3 3 3 4 4 25 55
Output: 10 25 55
*/


import java.util.*;


class p5{

	public static void main(String[] boss){
	

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of an array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];	
		System.out.println("Enter the element in an array: ");
	

		for (int i =0; i<arr.length;i++){
		
			arr[i] = sc.nextInt();
		}
	for(int i = 0; i<size;i++){
	
		if (arr[i]%5==0)
			System.out.println("the element divisible by 5 is: "+arr[i]);
	}
	
	}



}
