//SortedMap:
//
/*
--it is an interface
--out put is in sortd manar 
--their are some methids:

public abstract java.util.SortedMap<K, V> subMap(K, K);
  public abstract java.util.SortedMap<K, V> headMap(K);
  public abstract java.util.SortedMap<K, V> tailMap(K);
  public abstract K firstKey();
  public abstract K lastKey();
  public abstract java.util.Set<K> keySet();
  public abstract java.util.Collection<V> values();
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();

 
 */ 



import java.util.*;

class SortedMapDemo{

	public static void main(String[] boss){
	
		SortedMap sm=new TreeMap();

		sm.put("ram","dhanush");
		sm.put("bajrangbali","gadha");
		sm.put("chattrapti shivaji maharaj" ,"talavar");
		sm.put("arjun","dhanush");
		sm.put("bhim","gadha");

		System.out.println(sm);

		//subMap
		System.out.println(sm.subMap("bhim" , "ram"));

		//headMap
		System.out.println(sm.headMap("bhim"));	
	}

}
