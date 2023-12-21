
/*
##PriorityQueue:

javap java.util.PriorityQueue
Compiled from "PriorityQueue.java"
public class java.util.PriorityQueue<E> extends java.util.AbstractQueue<E> implements java.io.Serializable {
  transient java.lang.Object[] queue;
  int size;
  transient int modCount;
  public java.util.PriorityQueue();
  public java.util.PriorityQueue(int);
  public java.util.PriorityQueue(java.util.Comparator<? super E>);
  public java.util.PriorityQueue(int, java.util.Comparator<? super E>);
  public java.util.PriorityQueue(java.util.Collection<? extends E>);
  public java.util.PriorityQueue(java.util.PriorityQueue<? extends E>);
  public java.util.PriorityQueue(java.util.SortedSet<? extends E>);

Methods:
  public boolean add(E);
  public boolean offer(E);
  public E peek();
  public boolean remove(java.lang.Object);
  void removeEq(java.lang.Object);
  public boolean contains(java.lang.Object);
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  public java.util.Iterator<E> iterator();
  public int size();
  public void clear();
  public E poll();
  E removeAt(int);
  public java.util.Comparator<? super E> comparator();
  public final java.util.Spliterator<E> spliterator();
  public boolean removeIf(java.util.function.Predicate<? super E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public void forEach(java.util.function.Consumer<? super E>);
}
 
 */



import java.util.*;

class PQDemo{

	public static void main(String[] boss){
		
		PriorityQueue pq = new PriorityQueue();
		pq.offer(20);
		pq.offer(10);
		pq.offer(40);
		pq.offer(50);
		pq.offer(30);
		pq.offer(50);

		System.out.println(pq);   //the output is depending upon heap algorithum
		
		pq.poll(); //remove the first element
		System.out.println(pq);
		pq.remove();  //this also remove the firstElement
		System.out.println(pq);

		System.out.println(pq.peek());   //it return the firstElement without the remving or delleting
		System.out.println(pq.element()); //it return the firstElement without the remving or delleting
		
		System.out.println(pq);

		//removeEq

	//	pq.removeEq(10);   //return is void  ,,but this is have return type is defoualt so can not accases them
		System.out.println(pq);

	}
} 
