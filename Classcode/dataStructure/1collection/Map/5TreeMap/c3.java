//using Comparator 
import java.util.*;
class Platform{

	String pName =null;
	int date =0;

	Platform(String pName,int date){

		this.pName = pName;
		this.date = date;

	}



	public String toString(){
	
		return "{"+pName +":"+date+"}";
	
	}

}

class sortByName  implements Comparator{

	public int compare(Object obj1 , Object obj2){
	
		return (((Platform)obj1).pName).compareTo(((Platform)obj2).pName);
	
	}

}

class sortByDate implements Comparator{

	
	public int compare(Object obj1,Object obj2){
	
		return ((Platform)obj1).date - ((Platform)obj2).date;
	}


}


class TreeMapDemo{


	public static void main(String[] boss){
	
		SortedMap sm = new TreeMap(new sortByName());
		//SortedMap sm = new TreeMap(new sortByDate());
		
		sm.put(new Platform("Instaram" , 2010),"meta");
		sm.put(new Platform("Facebook" , 2004),"meta");
		sm.put(new Platform("Youtube"  , 2005),"Google");
		sm.put(new Platform("Netflex",2003),"Net");
		sm.put(new Platform("Snapchat",2007),"company");

		System.out.println(sm);
		


	}
	

}
