//9. WAP to print string in reverse order.


import java.util.*;
class Rec{

	String usingFor(String str){
	
		char[] arr = str.toCharArray();

		for(int i =0;i<arr.length/2;i++){
	
			char temp = arr[i];

			arr[i] = arr[arr.length-1-i];

			arr[arr.length-1-i] = temp;
		
		}
		return new String(arr);
	}


	//recursive function
	

	char arr[] = null;
	String usingRec(String str){
	
		
	
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string");

		String str = sc.nextLine();

		Rec obj = new Rec();
		String ret1 = obj.usingFor(str);

		System.out.println(ret1);



	
	}

}
