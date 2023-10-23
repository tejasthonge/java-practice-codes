/*
#1HashMap:

	--it is class so we can create thir object 
	--it is child of map interface
[O	--it contins key and value pair
	--it Sequence is not remane same 
	--sequence is depending upon Key
 
 */

import java.util.*;

class HashMapDemo{


	public static void main(String[] boss){


		HashMap hm = new HashMap();

		//it have put method like add in collection

		hm.put("Kanha","company1");
		hm.put("Ashish","company2");
		hm.put("Badhe","company3");
		hm.put("Rahul","company4");

		System.out.println(hm);  //op:{Rahul=company4, ashish=company2, Badhe=company3, Kanha=company1}
	//check the out put sequence
	//
	//check HashSet output Sequence
	
		HashSet hs = new HashSet();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs);
	
	//{Rahul=company4, Ashish=company2, Badhe=company3, Kanha=company1}
	//[Rahul, Ashish, Badhe, Kanha]

	//both are same
	}


}
