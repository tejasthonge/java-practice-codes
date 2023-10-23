/*

"LinkedHashMap.java"

	--out put sequence is remain same
  public class java.util.LinkedHashMap<K, V> extends java.util.HashMap<K, V> implements java.util.Map<K, V> {
  transient java.util.LinkedHashMap$Entry<K, V> head;
  transient java.util.LinkedHashMap$Entry<K, V> tail;
  final boolean accessOrder;
  void reinitialize();
  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;

constructor:
  public java.util.LinkedHashMap(int, float);
  public java.util.LinkedHashMap(int);
  public java.util.LinkedHashMap();
  public java.util.LinkedHashMap(java.util.Map<? extends K, ? extends V>);
  public java.util.LinkedHashMap(int, float, boolean);

Methods:
  public boolean containsValue(java.lang.Object);
  public V get(java.lang.Object);
  public V getOrDefault(java.lang.Object, V);
  public void clear();
  protected boolean removeEldestEntry(java.util.Map$Entry<K, V>);
  public java.util.Set<K> keySet();
  final <T> T[] keysToArray(T[]);
  final <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
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

		System.out.println("Dist. of narhe is "+ lm.get("narhe"));

		System.out.println("set of Dist.(values) = "+lm.values());
		System.out.println("set of gao (keys) = "+lm.keySet());


		//this is final
//		int setarr[] = lm.keysToArray();
//		System.out.println("array of keys or gao is " + setarr);
	


		System.out.println(lm.entrySet());
	}



}
