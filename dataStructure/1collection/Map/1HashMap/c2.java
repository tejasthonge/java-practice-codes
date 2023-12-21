/*
 Methods of HashMap:

  final void putMapEntries(java.util.Map<? extends K, ? extends V>, boolean);

  public int size();
  public boolean isEmpty();
  public V get(java.lang.Object);

  final java.util.HashMap$Node<K, V> getNode(java.lang.Object);

  public boolean containsKey(java.lang.Object);
  public V put(K, V);

  final V putVal(int, K, V, boolean, boolean);
  final java.util.HashMap$Node<K, V>[] resize();
  final void treeifyBin(java.util.HashMap$Node<K, V>[], int);

  public void putAll(java.util.Map<? extends K, ? extends V>);
  public V remove(java.lang.Object);

  final java.util.HashMap$Node<K, V> removeNode(int, java.lang.Object, java.lang.Object, boolean, boolean);

  public void clear();
  public boolean containsValue(java.lang.Object);
  public java.util.Set<K> keySet();

  final <T> T[] prepareArray(T[]);

  <T> T[] keysToArray(T[]);
  <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public V getOrDefault(java.lang.Object, V);
  public V putIfAbsent(K, V);
  public boolean remove(java.lang.Object, java.lang.Object);
  public boolean replace(K, V, V);
  public V replace(K, V);
  public V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public java.lang.Object clone();

  final float loadFactor();
  final int capacity();

  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  void reinitialize();
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;

 */

import java.util.*;

class HashMapDemo{


	public static void main(String[] boss){
	
		HashMap hs = new HashMap();
		hs.put("Shivaji raje","Hidu");
		hs.put("BhagatSingh","Hindu");
		hs.put("rajgur sudhdev","hindu");
		hs.put("Savarkar","Hidu");
		hs.put("india","secular country");

		hs.put("Muhammad Ali Jinnah","cut..");
		hs.put("pakistan","islamic country");

		hs.put("pm", "Yogi");
		System.out.println(hs.size());

		System.out.println(hs.isEmpty());

		System.out.println(hs.containsValue("Hindu"));

		System.out.println(hs.remove("pakistan"));

		System.out.println("india is : "+hs.get("india"));

		System.out.println("after "+ hs.get("pm"));

	 hs.replace("india","Hundurashatra");

	 System.out.println("india is "+hs.get("india"));
			
	
	
	}





}
