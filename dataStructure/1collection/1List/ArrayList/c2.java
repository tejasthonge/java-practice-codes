//passing the user define obeje or elemmet to arraylist
import java.util.*;
class ItComp{

	String cName= null;

	 ItComp(String cName){
		this.cName= cName;
			
		ItComp.printName(cName);
	}
	static void printName(String cName){
	
		System.out.println(cName);
	}

	public String toString(){
		
		return this.cName;	
	
	}
}


class ArrayListDemo{


	public static void main(String[] boss){
	
		ItComp name1 =new ItComp("Facebook");
		ItComp name2 =new ItComp("Apple");
		ItComp name3 =new ItComp("Microsoft");
		ArrayList compNameList = new ArrayList();
		compNameList.add(name1);
		compNameList.add(name2);
		compNameList.add(name3);
	
		System.out.println(compNameList);
	
	}

}
