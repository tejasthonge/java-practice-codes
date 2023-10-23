class c2{


	public static void main(String[] boss){
	
	
		String str1 ="Core2Web";
		String str2 = new String("Core2web");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

//it pritnt deferent-def identityHashCode the reson is str1 goes to String constant pull or str2 create new String object in heap sectio due 'new'	
//
//supose create str3 without using new then identyHashCode is same with str1

		String str3="Core2Web";
		System.out.println(System.identityHashCode(str3));
//the reasen str3 is go  in scp without creating new string and in java stack str1 as well str3 take same refrance from scp	
	}
}
