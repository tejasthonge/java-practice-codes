import java.util.*;


class TreeMapDemo{

	public static void main(String[] boss){
	
	
		TreeMap tm = new TreeMap();


		tm.put(2020,"csk");
		tm.put(2021,"csk");
		tm.put(2018,"csk");

		System.out.println(tm);  //out put is sorted mannar depending upon keys
	

	Set<Map.Entry> ms = tm.entrySet();

		System.out.println(ms);	
	
		Iterator itr = ms.iterator();

		while(itr.hasNext()){
		
			Map.Entry k =((Map.Entry)itr.next());
			System.out.println("{"+k.getKey() + ":"+ k.getValue()+"}");   //if we want only print key then print or as value also  
		
		}


	}


}
