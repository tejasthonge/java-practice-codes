//vector :
//--it is intraduse in java1.1 that means before the collection framwork
//--it is known as legacy class
//--vector is like as ArrayList
//--the method present in vector are same as ArrayList but their names are big
//--like add() method but vector have addElement()

//constructor :
/*
  public java.util.Vector(int, int);
  public java.util.Vector(int);
  public java.util.Vector();
  public java.util.Vector(java.util.Collection<? extends E>);
 */

//unique methods :

/*
  public synchronized E elementAt(int);
  public synchronized E firstElement();
  public synchronized E lastElement();
  public synchronized void setElementAt(E, int);
  public synchronized void removeElementAt(int);
  public synchronized void insertElementAt(E, int);
  public synchronized void addElement(E);
  public synchronized boolean removeElement(java.lang.Object);
  public synchronized void removeAllElements();

 */

//--it is child of List interface so all the methods present in list are accesible to the vector 
//like--> 
//add()
//get()
//set()
//remove()
//...etc

import java.util.*;

class VectorDemo{

	public static void main(String[] boss){
	
		Vector v = new Vector();

		v.addElement(43);
		v.addElement(23.4f);
		v.addElement("Hindu maratha");
		v.addElement("Amarraj");

		System.out.println(v);

		Iterator itr = v.iterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
	
	}

}

