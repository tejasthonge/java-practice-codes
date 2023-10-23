//enum :
//	--enum also class like class
//	--it is same as interface but interface have all the methods public abstract 
//	--but enum is not provide by defoult constructor 
//	--but constructor we can write in our code
//	--the parant class of enum (user define) is Enum class present in lang packege
//	--this means the Enum class only  accesible for thir chlid
//	--main use of enum is for indexing and redablity
//

/*
javap java.lang.Enum
Compiled from "Enum.java"
public abstract class java.lang.Enum<E extends java.lang.Enum<E>> implements java.lang.constant.Constable, java.lang.Comparable<E>, java.io.Serializable {
  public final java.lang.String name();
  public final int ordinal();
  protected java.lang.Enum(java.lang.String, int);
  public java.lang.String toString();
  public final boolean equals(java.lang.Object);
  public final int hashCode();
  protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public final int compareTo(E);
  public final java.lang.Class<E> getDeclaringClass();
  public final java.util.Optional<java.lang.Enum$EnumDesc<E>> describeConstable();
  public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T>, java.lang.String);
  protected final void finalize();
  public int compareTo(java.lang.Object);
}

*/
enum Lang{

//all the follong are object	

		//compilar provide inde like bellow
	c, 	//0
	cpp,	//1
	python,	//2
	java;	//3


}


class enumDemo{


	public static void main(String[] boss){

		System.out.println(Lang.c);   //compiler  add toString()
					      
		//to know the index of the cpp we use ordinal
		System.out.println(Lang.cpp.ordinal());  //method to print the index

		System.out.println(Lang.python.name());	 //this also print the name
		System.out.println(Lang.java.hashCode());
	
	
	}


}
