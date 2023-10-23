/*
TreeMap :
	--it is child of SortedMap and NaviagableMap interface
	--but both are interface so can not create theire object 
	--TreeMap is class so we can create theire object
	--
	--it is child of SortedMap so we got output in sorted mannar
	--
 
 */


import java.util.*;
class Platform implements Comparable{

	String pName =null;
	int date =0;

	Platform(String pName,int date){

		this.pName = pName;
		this.date = date;

	}
//Sort by int 
/*
	public int compareTo(Object obj){
	
		return this.date - ((Platform)obj).date;
	
	}
*/

//sort by string
	
	public int compareTo(Object obj){
	
		return this.pName.compareTo(((Platform)obj).pName);
	
	}
//note at time we sort only one paramete are passad



	public String toString(){
	
		return "{"+pName +":"+date+"}";
	
	}

}



class TreeMapDemo{


	public static void main(String[] boss){
	
		SortedMap sm = new TreeMap();
		
		sm.put(new Platform("Instaram" , 2010),"meta");
		sm.put(new Platform("Facebook" , 2004),"meta");
		sm.put(new Platform("Youtube"  , 2005),"Google");
		sm.put(new Platform("Netflex",2003),"Net");
		sm.put(new Platform("Snapchat",2007),"company");

		System.out.println(sm);
		


	}
	

}
