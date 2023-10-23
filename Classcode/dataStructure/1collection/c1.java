/*
Collection : it is the bunch of class that praforms verius opretion in deta store in varireble that are real time entity occurs in us 

--that deta are store in such order to essey to accase 
--collection is inteface and have three child class of it thos have specil feture 
--1.List
--2.Set
--3.Queue



  public abstract int size();
  public abstract boolean isEmpty();
  public abstract boolean contains(java.lang.Object);
  public abstract java.util.Iterator<E> iterator();
  public abstract java.lang.Object[] toArray();
  public abstract <T> T[] toArray(T[]);
  public default <T> T[] toArray(java.util.function.IntFunction<T[]>);
  public abstract boolean add(E);
  public abstract boolean remove(java.lang.Object);
  public abstract boolean containsAll(java.util.Collection<?>);
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public default boolean removeIf(java.util.function.Predicate<? super E>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public default java.util.Spliterator<E> spliterator();
  public default java.util.stream.Stream<E> stream();
  public default java.util.stream.Stream<E> parallelStream();



 */


import java.util.*;

class CollectionDemo{


        public static void main(String[] boss){

                ArrayList ar = new ArrayList();

                ar.add(12);
                ar.add(14);
                ar.add(10);

		ArrayList ar2 = new ArrayList();

		ar2.add(20);
		ar2.add(30);
		ar2.add(40);
		ar2.add(20);
		ar2.add(12);

		ar2.addAll(ar);
		System.out.println("remove "+ ar2.remove(2));
		System.out.println("element in ar2 " + ar2);

//		if(ar.equls(ar2))
//			System.out.print("a2 size is equls to ar ");
  
  		System.out.println(ar);

		System.out.println("size "  + ar.size());
		System.out.println("isEmpty "+ ar.isEmpty());
		System.out.println("12 is contains "+ar.contains(12));


		LinkedList ls = new LinkedList();

		ls.add(12);
		ls.add(14);
		ls.add(10);

		if (ls.containsAll(ar))
		System.out.println("arraylist contains the all the element present in linkedlist");
        }


}

