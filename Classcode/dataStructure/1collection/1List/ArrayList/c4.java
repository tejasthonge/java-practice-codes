//convrting the Intger array into arraylist
import java.util.*;
class ArrayListDemo{
	
	public static void main(String[] boss){
	
		int arr[] = {20,40,60,70,40,30,20};
		
		ArrayList al = new ArrayList();

		for(int i = 0; i<arr.length;i++){
		
			al.add(arr[i]);
		}

		System.out.println(al);
	
	}


}
