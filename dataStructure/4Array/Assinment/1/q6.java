/*

   Q6. Product array puzzle
Problem Description
- Given an array of integers A, find and return the product array of the same
size where the ith element of the product array will be equal to the
product of all the elements divided by the ith element of the array.
- Note: It is always possible to form the product array with integer (32 bit)
values. Solve it without using the division operator.
Constraints
2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example
Input 1:
A = [1, 2, 3, 4, 5]
Output 1:
[120, 60, 40, 30, 24]
Input 2:
A = [5, 1, 10, 1]
Output 2:
[10, 50, 5, 50]
   */

class ArrayDemo{


	public static void main(String[] boss){
	
//		int A[] = new int[]{1,2,3,4,5};
		int A[] = new int[]{5, 1, 10, 1};
		int prodArr[] = new int[A.length];
		int N=A.length;
		int product = 1;
		for(int i= 0;i<N;i++){
			
			product =product*A[i];
		}
		
//		System.out.println(product);
		for(int i= 0;i<N;i++){
			prodArr[i] = product/A[i];
			System.out.print(prodArr[i] +" ");
		}
		System.out.println();
		}
	}



