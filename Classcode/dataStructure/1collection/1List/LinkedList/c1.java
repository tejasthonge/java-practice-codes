/*
 
#2) LinkedList :

	--it is child of list so it allows duplicate data
	--the deff.  bett. linkedList and arrayList is memory allocation 
	--arraylist is supose trean 
	--the LinkedList is  stars in sky 
	--in linkedlist object does not have sequentioly momory alloction



   methods:
   	--
  public E getFirst();
  public E getLast();
  public E removeFirst();
  public E removeLast();
  public void addFirst(E);
  public void addLast(E);
  public boolean contains(java.lang.Object);
  public int size();
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  public void clear();
  public E get(int);
  public E set(int, E);
  public void add(int, E);
  public E remove(int);
  java.util.LinkedList$Node<E> node(int);
  public int indexOf(java.lang.Object);
  public int lastIndexOf(java.lang.Object);
  public E peek();
  public E element();
  public E poll();
  public E remove();
  public boolean offer(E);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E peekFirst();
  public E peekLast();
  public E pollFirst();
  public E pollLast();
  public void push(E);
  public E pop();
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
  public java.util.ListIterator<E> listIterator(int);



 */

import java.util.*;
class c1{

	public static void main(String[] boss){
	
		LinkedList ll = new LinkedList();

		ll.add(89);
		ll.add("Boss");
		ll.add(32669.32);
		ll.add(32.4f);
		ll.add(true);
		ll.add('A');

		System.out.println(ll);

		ll.addFirst("Amarraj");
		ll.addLast("Thonge");
		System.out.println(ll);	

		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());

		System.out.println(ll.element());


		System.out.println(ll.pop());


		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());


		ll.addFirst("addedFirst");
		ll.addLast("addedLast");
		System.out.println(ll);

	}



}
