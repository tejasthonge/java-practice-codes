/*
 Program 2
WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3
   */

import java.util.*;
class ArrayDemo{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array : ");
	int N= sc.nextInt();

	int arr[] = new int[N];
	int ecount=0;
	int ocount=0;
	for(int i=0;i<N;i++){

		arr[i] = sc.nextInt();
		if(arr[i]%2==0){
		
			ecount++;
		}
		else{
		ocount++;
		}
	}

	System.out.println("even no in array : " + ecount);
	System.out.println("odd no in array : " + ocount);
	
	}

}
