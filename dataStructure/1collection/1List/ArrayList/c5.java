//convarting array string into arraylist
//


import java.util.*;

class ArrayListDemo{


	public static void main(String[] boss){
	
	
		String arr[] = {"ram","lakhan","maruti"};

		List as = Arrays.asList(arr);   //it method present in Arrays class having returen value collection
		ArrayList al = new ArrayList(as);
		System.out.println(al);
	
	}


}
