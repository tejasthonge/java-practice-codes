/*
 

  #1) ArrayList :

  	--ArrayList is child of List so it allow the duplicete deta 
	--in ArrayList memory alloction of each object is sequantionl 
	--so we can accese the ellement by using thire index
	--each deta is store in sequentioal order 
	--list order is same as insartion order 


   Compiled from "ArrayList.java"
   public class java.util.ArrayList<E> extends AbstractList implements List, RandomAccess,Cloneable, Serializable {
  transient java.lang.Object[] elementData;

methods:

unique methods:

  public java.util.ArrayList(int);
  public java.util.ArrayList();
  public java.util.ArrayList(java.util.Collection<? extends E>);
  public void trimToSize();
  public void ensureCapacity(int);


  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  int indexOfRange(java.lang.Object, int, int);
  public int lastIndexOf(java.lang.Object);
  int lastIndexOfRange(java.lang.Object, int, int);
  public java.lang.Object clone();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  E elementData(int);

  unuque methods:

  static <E> E elementAt(java.lang.Object[], int);
  public E get(int);
  public E set(int, E);
  public boolean add(E);
  public void add(int, E);
  public E remove(int);
  public boolean equals(java.lang.Object);
  boolean equalsRange(java.util.List<?>, int, int);
  public int hashCode();
  int hashCodeRange(int, int);

  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  protected void removeRange(int, int);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
  public java.util.ListIterator<E> listIterator(int);
  public java.util.ListIterator<E> listIterator();
  public java.util.Iterator<E> iterator();
  public java.util.List<E> subList(int, int);
  public void forEach(java.util.function.Consumer<? super E>);
  public java.util.Spliterator<E> spliterator();
  public boolean removeIf(java.util.function.Predicate<? super E>);
  boolean removeIf(java.util.function.Predicate<? super E>, int, int);
  public void replaceAll(java.util.function.UnaryOperator<E>);
  public void sort(java.util.Comparator<? super E>);
  void checkInvariants();
  static {};
}

 */




import java.util.*;

class ArrayListDemo{


	public static void main(String[] boss){
	
		ArrayList ar = new ArrayList();

		ar.add(12);
		ar.add(14);
		ar.add(10);
		ar.set(0,23);
		ar.add(0,24);
		ar.remove(0);
		System.out.println(ar);
	
	}


}
