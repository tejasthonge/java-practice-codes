/*
3IdentityHasHMap :

	--same key are remove by other maps 
	--to put same keys without dataloss we have use IdentityHashMap



 */


import java.util.*;

class IdentityHashMapDemo{

	public static void main(String[] boss){
	
		IdentityHashMap sid = new IdentityHashMap();

		sid.put("pune","nare");
		sid.put("pune","katraj");
		sid.put("pune","Dhayari");
		sid.put("pune","wadagao");

		System.out.println("keys are same  but removed, due to scp "+ sid);

		IdentityHashMap snd = new IdentityHashMap();

		snd.put(new String("pune"),"nare");
                snd.put(new String("pune"),"katraj");
                snd.put(new String("pune"),"Dhayari");
                snd.put(new String("pune"),"wadagao");

		System.out.println("keys are object are all differnt but sting same passed buy not remove"+snd);


		HashMap sd = new HashMap();

                sd.put(new String("pune"),"nare");
                sd.put(new String("pune"),"katraj");
                sd.put(new String("pune"),"Dhayari");
                sd.put(new String("pune"),"wadagao");

		System.out.println("keys are object are all differnt but sting same passed but remove"+sd);
	}



}
