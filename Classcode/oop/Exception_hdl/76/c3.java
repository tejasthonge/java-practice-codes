//# throws user define exeption

//handle the or thows exeption :take the element form user and of an array and each ellement must be in  range of 0 to 100 if the element is not in rang then thwos the user define exaption

import java.util.Scanner;
class DataOverflowExeption extends RuntimeExeption {

	DataOverflowExeption(String msg){
		super(msg);
	
	
	}

}

class DataUnderflowExeption extends RuntimeExeption{

	DataUnderflowExeption(String msg){
		super(msg);
	
	}
}

class ArrDemo{

	public static void main(String[] boss){
	
		int arr[] = new int[5];

		System.out.println("enter the element in range of 0 to 100");
		Scanner sc = new Scanner(System.in);

		try{
		for(int i =0 ;i<arr.length;i++){
		
			arr[i] = sc.nextInt();
			if (arr[i]<0)
				throw new DataUnderflowExeption("mitra no ha 0 peksh lahan ahe");
		
			if(arr[i]>100)
				throw new DataOverflowExeption("mitra no 100 peksha motha ahe");
			}
		}
		catch(DataOverflowExeption o){
		

		}
		catch(DataUnderflowExeption u){
		
		}
		
		
	
	}






}
