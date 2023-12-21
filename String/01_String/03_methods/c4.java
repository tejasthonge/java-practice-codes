//comparTo
//
//method : public int compareTo(String str2)
//
//Description : it compare str1 to str 2 (case sensitive) if both the string is same the it returnd 0 and not same it rutrns dffarans bettwen them
//
//parametr : String str2
//rutran type : integer
//


class compareToDemo{

	public static void main(String[] boss){
	
	
		String str1 ="Amar_thonge";
		String str2 ="amar_thonge";

		System.out.println(str1.compareTo(str2));    //calling the inbilt method 
		
		//calling the own method myCompare to
		int def = myCompareTo(str1,str2);
	
	
	}
	
	static int myCompareTo(String str1,String str2){
	
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int dif=0;
		if(arr1.length==arr2.length){
		for (int i = 0; i<arr1.length;i++){
		       if(arr1[i] != arr2[i]){
	       
			     dif = arr2[i]-arr1[i]  ;   
			    
			    
			    } 
		       
		       else
			      {
			      dif =dif;
			      }
			}
		}
		
	
		else{
	
			System.out.println("size of string1 is diffarent to size string2");
 		}

	return dif;

	}

}
