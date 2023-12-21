/*
 
   TreeSet:

    --it is child or in set family so dosnt allow dupicate data
    -- insartion order is chenged due to it sort the printive object or remove the douplicate data
    --it implimets the navigableset or AbstractSet

 
    	construcors:
       		 public java.util.TreeSet();
  	 	 public java.util.TreeSet(java.util.Comparator<? super E>);
  		 public java.util.TreeSet(java.util.Collection<? extends E>);
  		 public java.util.TreeSet(java.util.SortedSet<E>);

	coursor:
		  public java.util.Iterator<E> iterator();
		  public java.util.Iterator<E> descendingIterator();
		  public java.util.NavigableSet<E> descendingSet();

	methods:


  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);

  public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public java.util.NavigableSet<E> headSet(E, boolean);
  public java.util.NavigableSet<E> tailSet(E, boolean);
  public java.util.SortedSet<E> subSet(E, E);
  public java.util.SortedSet<E> headSet(E);
  public java.util.SortedSet<E> tailSet(E);
  public java.util.Comparator<? super E> comparator();
  public E first();
  public E last();
  public E lower(E);
  public E floor(E);
  public E ceiling(E);
  public E higher(E);
  public E pollFirst();
  public E pollLast();

  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();

 */


import java.util.*;

class TreeSetDemo{

	public static void main(String[] boss){
	
		TreeSet ts = new TreeSet();
		ts.add("fortuner");
		ts.add("mustang");
		ts.add("harrier");
		boolean b = ts.add("harrier");

		System.out.println(ts);
		System.out.println(b);
		System.out.println(ts.size());
		System.out.println(ts.contains("mustang"));
		ts.add("nano");
		ts.remove("nano");
		System.out.println(ts);

		TreeSet ts1 = new TreeSet();
	
		ts1.add(10);
		ts1.add(39);
		ts1.add(20);
	//	ts1.add("amarraj");  //  TreeSet is sorted, it cannot sort String and Integer together. Thats why you are getting this exception.
		System.out.println(ts1);
		
		TreeSet ts2= new TreeSet();
		
		ts2.addAll(ts1);
		//coursor
		Iterator itr =ts2.iterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		
		}
		
		System.out.println(ts1.equals(ts2));
		System.out.println(ts2.first());
		System.out.println(ts2.last());
		System.out.println(ts2.higher(10));
		System.out.println(ts2);
		
		System.out.println("headSet:"+ts2.headSet(20));
		System.out.println("tailSet:"+ ts2.tailSet(20));
		System.out.println("subSet:"+ ts2.subSet(10,20));
	}


}
