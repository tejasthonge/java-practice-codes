/*
 

  ###Map:--it is Interface Having no parent interface
  	 --it contains kay "k" and value pair "v"
 	--it is collection interface is not parent of map
	--same method of map are retuns collection like set ,list
	--coursar is not present in map but bay convarting map to collection we can add coursr on map
    javap java.util.Map
Compiled from "Map.java"
public interface java.util.Map<K, V> {

Methods
  public abstract int size();
  public abstract boolean isEmpty();
  public abstract boolean containsKey(java.lang.Object);
  public abstract boolean containsValue(java.lang.Object);
  public abstract V get(java.lang.Object);
  public abstract V put(K, V);
  public abstract V remove(java.lang.Object);
  public abstract void putAll(java.util.Map<? extends K, ? extends V>);
  public abstract void clear();
  public abstract java.util.Set<K> keySet();
  public abstract java.util.Collection<V> values();
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public default V getOrDefault(java.lang.Object, V);
  public default void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public default void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V putIfAbsent(K, V);
  public default boolean remove(java.lang.Object, java.lang.Object);
  public default boolean replace(K, V, V);
  public default V replace(K, V);
  public default V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
  public default V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
  public default V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
  


  public static <K, V> java.util.Map<K, V> of();
  public static <K, V> java.util.Map<K, V> of(K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> ofEntries(java.util.Map$Entry<? extends K, ? extends V>...);
  public static <K, V> java.util.Map$Entry<K, V> entry(K, V);
  public static <K, V> java.util.Map<K, V> copyOf(java.util.Map<? extends K, ? extends V>);
}
 */
