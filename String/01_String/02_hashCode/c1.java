class hashCodeDemo{


	public static void main(String[] boss){
	
		String str1 = "thehindumaratha";
		String str2 = new String("thehindumaratha");

		String str3 ="thehindumaratha";

		char str4[] ={'t','h','e','h','i','n','d','u','m','a','r','a','t','h','a'};
		System.out.println(str4);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());  //the charectors in array is same as string str1 but hash code is diffarent ?
	
		//hashCode is nething but same no that represent same values 
		//it is totaly opousit of identity hashCode
		//
	}



}
