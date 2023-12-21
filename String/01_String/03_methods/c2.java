
// method :public int length();
//
//Description : it return no of charachator present in given string
//
//parametor : no parametor 
//return type : int
//


class lengthDemo{



	public static void main(String[] boss){
	
		String str1 = "miMaratha";
		System.out.println(str1.length());   //thes is inbilt method in string now create own myLength metheod 
		int len = myLength(str1);            //colling to the myLength function created by own
		System.out.println(len);
	
	
	}
	// defining my length function to count the  no of charector present in given string
	static int myLength(String str){
	
		char arr[] = str.toCharArray();  //to first we have to  create String to char array  for counting the element in array by uding toCharArray() method  (inbilt)
		int count=0;
		for(char x:arr){
			count++;
		       //System.out.println(x);
		}
          	return count;
	}

}
