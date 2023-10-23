/*
Program 1
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the sum of all elements in the array.
Input:
n=6
Enter elements in the array: 2 3 6 9 5 1
Output:26
   */


import java.util.*;

class ArrayDemo{

	public static void main(String[] boss){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the size");
	int size = sc.nextInt();

	int arr[] = new int[size];

	int sum =0;
	for(int i = 0;i<size;i++){
	
		System.out.println("index "+ i );
		arr[i] = sc.nextInt();
		sum = sum +arr[i];
	}
	
	System.out.println(sum);
	}


}
