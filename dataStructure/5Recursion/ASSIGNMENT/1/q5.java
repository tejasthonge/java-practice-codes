


//5. WAP to check whether the number is prime or not.


import java.util.*;
class Rec{

	boolean usingFor(int num){
	int count=0;

	for(int i =1;i<=num;i++){
	
		if(num%i==0){
			count++;
		}
	}
	if(num == 1){
		return false;
	}
	else if(count>=3){
		return false;
	}	
	else {
		return true;
	}

	}

	//using rec

	int count=0;
	int i=0;
	boolean flag = false;
	boolean usingRec(int num){
	
		 i++;
		if( i==num){
			
			return flag;
		}

		if(num%i==0)
			count++;

		usingRec(num);

		//System.out.println(count);
		if(count == 1){
		
			return true;

		
		}
		return flag;
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);	
		System.out.print("enter the no :");
		int num = sc.nextInt();
		
		Rec obj = new Rec();

		boolean ret1 = obj.usingFor(num);
		System.out.println(num +" is prime : " +ret1);
	
		boolean ret2 = obj.usingRec(num);
		System.out.println(num +" is prime : "+ ret2);	
	}

}
