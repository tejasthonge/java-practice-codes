//charAt(int index);
//
//method: public char charAt(int index);
//
//Description: it returns charector present in specific index within the given string
//
//parametors: int index
//return type: charector

class charAtDemo{

	public static void main(String[] boss){
	
	
		String str1 ="mardMaratha";
		System.out.println(str1.charAt(4));       //it returns charector M prisent at 4th index of String str
		//System.out.println(str1.charAt(0,4));   //it give error or not print charector bettwen 0to4 index for difrent method is present
	
		//colling own myCharAt methond 
		char element = myCharAt(str1 ,3);
		System.out.println(element);
	}

		//Difining myCharAt method 
	
	static char myCharAt(String str ,int index){
 		char arr[] = str.toCharArray();
      		return arr[index];
	
	}


}
