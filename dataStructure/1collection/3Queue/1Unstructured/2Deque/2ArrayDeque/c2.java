/*
 
  static final int inc(int, int);
  static final int dec(int, int);
  static final int inc(int, int, int);
  static final int sub(int, int, int);
  static final <E> E elementAt(java.lang.Object[], int);
  static final <E> E nonNullElementAt(java.lang.Object[], int);

 */

import java.util.*;

class ArrayDequeDemo extends ArrayDeque{

	public static void main(String[] boss){
	
		ArrayDeque ad = new ArrayDeque();

		ad.offer(11);
		ad.offer(23);
		ad.offer(2);
		ad.offer(32);
		ad.offer(23);

		//inc(int , int);
		
		System.out.println(ArrayDeque.inc(1,11));
	
	}


}
