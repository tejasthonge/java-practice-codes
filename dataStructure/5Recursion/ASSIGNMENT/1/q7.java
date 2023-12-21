//7. WAP to find the factorial of a number.


import java.util.*;

class Rec{


	

	int usingFor(int num){
	
		int fact=1;
		for(int i =num ;i!=0;i--){
			
			fact*=i;
			
		}
		return fact;
	}

	int fact1 =1;
	int j =0;

	int usingRec(int num){
		j++;

		if(j >num){
			return fact1;
		}
		fact1*=j;
		
		return usingRec(num);	

		}

	public static void main(String[] boss){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no : ");
		int num = sc.nextInt();


		Rec obj = new Rec();

		//using for
		int ret1 = obj.usingFor(num);
		System.out.println(ret1);

		//using recursion
		int ret2 = obj.usingRec(num);
		System.out.println(ret2);
	
	}

}
