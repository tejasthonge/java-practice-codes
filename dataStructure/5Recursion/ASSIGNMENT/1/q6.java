//6. WAP to calculate the sum of digits of a given positive integer.




import java.util.*;

class Rec{

	//using for
	int usingFor(int num){	

		int sum=0;
		while(num != 0){
		
		int rem = num%10;
		sum +=rem;
		num/=10;

		}
		return sum;
	
	}

	//usig rec
	
	int sum=0;
	int usingRec(int num){
	
		if(num ==0 )
			return sum;

		int rem = num%10;
		sum +=rem;

		num/=10;
		return usingRec(num);


	}

	public static void main(String[] boss){
	

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no : ");
		int num = sc.nextInt();

		Rec obj = new Rec();

		int ret1 = obj.usingFor(num);
		System.out.println(ret1);
			
		int ret2 = obj.usingRec(num);
		System.out.println(ret2);

	}

}
