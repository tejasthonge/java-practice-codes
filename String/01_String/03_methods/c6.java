//equals
//
//method : equals(object obj);
//
//Description : it check an object charator is semetrically equal or not 
//
//parametor : Object obj
//return type : bollean
//

class equalsDemo {


	public static void main (String[] boss){
	
		String str1 ="amar_Boss";
		String str2= new String("amar_Boss");

		System.out.println(str1.equals(str2));  //it check the equlity of each charactor but present in diffrent objesct
							//
	
		String str3= new String("Amar_Boss");
		System.out.println(str1.equals(str3));  //it comare each charector present in diffarant object but 'a' of'A' is diffarant so it print false
	
	}



}
