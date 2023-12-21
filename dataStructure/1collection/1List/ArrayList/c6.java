
import java.util.*;

class ArrayListDemo{

	public static void main(String[] boss){
	
		int arr[] =  {22,33,55,66,55,33,22};

		ArrayList al = new ArrayList();

		for(int i = 0; i<arr.length;i++){
		
			al.add(arr[i]);
		
		}
	
		System.out.println("element in arraylist" + al);

		al.add(555);
		al.add(111);
		System.out.println("last added elemet add last  "+ al);

		al.set(8,33);   //if we set then old element is replase
		System.out.println("set the element at index 8" + al);

	//	al.set(1111);
	//	System.out.println("set elemet without using index 1111");  //gives error without index can not be set the element


		System.out.println("get element at index one :"+al.get(1));

		System.out.println("size of an ArrayList : "+al.size());

		System.out.println("removed ellemet is : "+al.remove(4));  //two remove method 1 is return type element and have parametor Index of element


		System.out.println("66 integer is removed : "+al.remove((Integer)66));

		System.out.println("66 is contains : "+al.contains(66));

		System.out.println("index of 22 is : "+ al.indexOf(22));
		System.out.println("last index of 22 is : "+al.lastIndexOf(22));



		ArrayList A = new ArrayList();
		for(int i =0;i<arr.length ; i++){
			A.add(arr[i]);
		
		}

		System.out.println("new ellement added of not (addAll()) : "+al.addAll(A));
		System.out.println("added ellement is : " + al);

	//	System.out.println("remove range  0 to 7  :  "+removeRange(0,7)); //this is protected so only accses for child

	//	System.out.pritnl("remove all : "+al.removeAll(A));
	//	System.out.println("ArrayList is: " + al) ;



	}



}
