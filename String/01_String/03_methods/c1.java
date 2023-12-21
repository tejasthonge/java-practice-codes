//merthod : public String concat(String str)
//
//Discription:- secod string is attached or concated with first string
//	      - it impliment new charector array and his length is sum of lenth of str1 and str2

//parametars:String
//return type: Stirng
class concatDemo{

	public static void main(String[] boss){
	
	
		String str1 ="Hindu";
		String str2 ="maratha";
		System.out.println(str1+str2);    //in the  actyuale concat nat happan in this intaranly call to append method present in 'Steing Bueilder class' that like concateation
		System.out.println(str1.concat(str2));//we call to concate method 

//		System.out.println(System.identityHashCode(str1+str2) );
//		System.out.println(System.identityHashCode(str1.concat(str2));
	
	}



}
