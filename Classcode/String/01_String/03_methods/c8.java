//method : indexOf(char '' ,int index of elment)
//
//Description: it find the index of ellement from which index you want
//
//parametor : charector or integer
//return type:intiger


class indexOfDemo {

	public static void main(String[] boss){
	
		String str ="Raja Shiv Chattrapati";

		System.out.println(str.indexOf('S',0));
		System.out.println(str.indexOf('S',2));

	
		System.out.println(myIndexOf(str,'S'));
	
	}



	//myIndexOf(String str,ch)
	

	static int myIndexOf(String str,char ch){
		int ind=0;
	
		char arr[] = str.toCharArray();

		for(int i= 0; i<arr.length ;i++){
		
			if(arr[i]==ch){
			ind= i;
			break;
			}
		}
	return ind;
	}

}
