/*
 2.HashSet:
 	--this have one specile feture that is only duplicate deta are not store
 	--this child of set so duplicate deta is not allowed 
	--it have sorting unic method that sort the elemet in spesific mannar 
	--no asending or desending
	--to sort then we have pass to treese  or 


  constructors:
		  public java.util.HashSet();
 		  public java.util.HashSet(java.util.Collection<? extends E>);
		  public java.util.HashSet(int, float);
		  public java.util.HashSet(int);
		  java.util.HashSet(int, float, boolean);


coursor:
 public java.util.Iterator<E> iterator();
 
method :
	--HashSet inherite all the methods of set
	--their is no special method
  
 */

import java.util.*;

class HashSetDemo{

	public static void main(String[] boss){
	
		HashSet hs= new HashSet();
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(50);
		hs.add(20);
		hs.add(40);
		System.out.println(hs);
	}

}
