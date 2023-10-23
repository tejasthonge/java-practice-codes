

//Collections (Class):
//--this is class having method
//1.sort
//---->public static <T> void sort(java.util.List<T>, java.util.Comparator<? super T>);
// --how we sort the ArrayList ellemet without pasing to TreeSet or more set type collections
//---we can sort the ArrayList elemnt by passing to set but the doupilcate deta or ellement is remove so minimize this proble we use this sort method 

import java.util.*;

class ArrayListDemo{


	public static void main(String[] boss){
	
		ArrayList ar = new ArrayList();
		ar.add(232);
		ar.add(193);
		ar.add(232);
		ar.add(422);

		System.out.println(ar);

		System.out.println("after Collections.sort(ar):");

		Collections.sort(ar);

		System.out.println(ar);
	
	
	}



}
