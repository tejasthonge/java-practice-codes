

import java.util.*;

class SolarSys{

	String planeat =null;
	int sNo = 0;
	
	SolarSys(String planeat, int sNo){
		this.planeat = planeat;
		this.sNo =  sNo;
	
	}
	public String toString(){
	
		return  "( " + planeat + " is at no from sun: " + sNo + " ) ";
	
	}

}

class ComparatorDemo{


	//Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune.

	public static void main(String[] boss){
	
		ArrayList al = new ArrayList();
	
		al.add(new SolarSys("Mars",4));
		al.add(new SolarSys("Venus",2));
		al.add(new SolarSys("Mercury",1));
		al.add(new SolarSys("BharatMata",3));

		System.out.println(al);


		//lambda function on comparator have only one method compare()

		Comparator cptr = (obj1 , obj2)->{
		
			return (((SolarSys)obj1).sNo - ((SolarSys)obj2).sNo);
		
		};

		Collections.sort(al,cptr);

		System.out.println(al);
	}


}
