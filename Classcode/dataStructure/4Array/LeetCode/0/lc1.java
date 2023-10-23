/*
1. Reverse Integer (Leetcode:- 7)
Given a signed 32-bit integer x, return x with its digits reversed. If reversing
x causes the value to go outside the signed 32-bit integer range [-231, 231
- 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed
or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
Constraints:
-231 <= x <= 231 - 1


*/


class Rev_Int{

	static int revInt(int n){
		int revNo =0;
		int rem = 0;
		while(n!=0){
		rem = n%10;
		revNo=rem + revNo*10;
		n/=10;
		
		}
		return revNo;
	
	}

	public static void main(String[] boss){
	
	int N = 123;
	
	System.out.println(Rev_Int.revInt(N));
	System.out.println(Rev_Int.revInt(120));
	System.out.println(Rev_Int.revInt(-123));	
	
	}


}
