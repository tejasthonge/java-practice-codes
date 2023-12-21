//8. WAP to count the occurrence of a specific digit in a given number.



import java.util.*;

class Rec{


	int usingFor(int num ,int e){
	
		int count=0;

		while(num!=0){
			int rem = num%10;
			if(rem == e){
				count++;
			}
			num/=10;
		}
		return count;
	}


	int counter=0;
	int usingRec(int num ,int e){
	
		if(num ==0)
			return counter;

		int rem = num%10;

		if(rem ==e)
			counter++;
		num/=10;
		return usingRec(num ,e);
	}

	public static void main(String[] boss){
	

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the intege :");

		int num = sc.nextInt();

		System.out.println("enter the digit that you want find count of occurrece ");
		int e = sc.nextInt();


		Rec obj=new Rec();
		//using for
		int ret1 = obj.usingFor(num ,e);		
		System.out.println(e + " is reppted " + ret1 +" times");

		//using rec
		int ret2 =obj.usingRec(num,e);
		System.out.println(e + " is reppted " + ret2 +" times");

	
	
	}

}
