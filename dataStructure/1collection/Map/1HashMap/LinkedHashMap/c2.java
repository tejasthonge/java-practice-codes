/*

"LinkedHashMap.java"

	--out put sequence is remain same
	

	*how apply coursor on map
}
*/

import java.util.*;

class LinkedHashMapDemo{

	public static void main(String[] boss){
	
	
		LinkedHashMap lm = new LinkedHashMap();



		lm.put("narhe","pune");
		lm.put("barshi","solapur");
		lm.put("phaltan","satara");
		lm.put("katraj","pune");
		lm.put("paranda","Dharashiv");

		System.out.println("sequnce remain same "+ lm);

	
		Set se = lm.keySet();

		System.out.println(se);

		//use iterator on keyset se
		//
		Iterator itr = se.iterator();

		
		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
	}



}
