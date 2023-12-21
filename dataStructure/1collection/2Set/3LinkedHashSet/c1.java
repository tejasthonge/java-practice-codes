/*
 
LinkedHashSet:

	
SorseCode:
	 javap java.util.LinkedHashSet
	 Compiled from "LinkedHashSet.java"
         public class java.util.LinkedHashSet<E> extends java.util.HashSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
	 public java.util.LinkedHashSet(int, float);
 	 public java.util.LinkedHashSet(int);
 	 public java.util.LinkedHashSet();
 	 public java.util.LinkedHashSet(java.util.Collection<? extends E>);
	 public java.util.Spliterator<E> spliterator();
}


 */
 
 import java.util.*;

 class LinkedHashSetDemo{
 
	 
	 public static void main(String[] boss){
	 
		 LinkedHashSet lhs = new LinkedHashSet();

		 lhs.add(20);
		 lhs.add(19);
		 lhs.add(5);
		 lhs.add(10);
		 lhs.add(5);//this 5 is duplicate so it does not adding into it the resion is it is child of set family
		 System.out.println(lhs);  //out put is not sorted like 
					   //insartion order is same as 
					   //when we requre insartion order same as or remove duplicate data that time this is used
	 
		 HashSet ls = new HashSet();

		 ls.add(lhs);
		 ls.add("mustang");
		 ls.add(100000000);
		 ls.add(true);
		 System.out.println(ls);

		 //methods:
		 //--it have only set and collection method so it does not have his own methods

		 lhs.remove(10);
//		 lhs.add(ls);	//when we add HashSet in LinkedHashSet it gives exeption StackOverflowError
//		lhs.add(0,222); //we can not accases th set element by thir index but in list we have permition
		lhs.add(555);
		 System.out.println(lhs);

		 //coursor:
		 //--we Iterator is univarsal coursor 
		 
		 Iterator itr = lhs.iterator();
		
		 
		 while(itr.hasNext()){
		 
			 System.out.println(itr.next());   //this next method is  has return type is E so he first print the element then go towords the next element
			 itr.remove();  //after the printing the (next) the element get removed so sop (ihs) print blank []
		 }
		 System.out.println(lhs);
	 }

 

 
 
 }
