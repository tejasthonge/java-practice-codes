//how to use lambd function on forEach
//
//
//


import java.util.*;
class ForEachDemo{

	public static void main(String[] boss){
	
		ArrayList al = new ArrayList();

		al.add(23);
		al.add(25);
		al.add(21);

		System.out.println(al);

		al.forEach(elm -> System.out.println(elm));
	}


}
