//01-05-2023
//
//Srting:
//-it is class in java
//-array of char is also String 
//-in heap for integer integerCache is present 
//-for String String Constant pull is present 
//- the string created like --> String str = "amar_boss";
//-above string is stored in String constant pull 
//- if we create other String str2= "amar_boss"
//-this aslo same refarance like str in string constant pull in heap 
//-that means the identityHashCode of botha of them are same 
//
//-but we create String like bellow
//-String str1= new String("amar_boss");
//-the new object is created in heap section and identityHashCode of (str==str1!=str2) is not same 
//-
//-->their are three way to write the String 

class c1{

	public static void main(String[] boss){
	
		String str1="amar_boss";

		String str2= new String("amar_boss");

		char str3[] ={'a','m','a','r','_','b','o','s','s'};

		//above is the way to declere the string
		//3rd is array of charector is nething but string

		//now printin String
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	
	
	}



}
