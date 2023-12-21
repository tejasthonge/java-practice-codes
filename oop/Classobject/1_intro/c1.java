class clsobj{
//

	int x = 10;          //instace non static vareale to stare or give the strege the constratre concept is bilt in java only or non static instance or nonstatic globle vareable
//for proof cheack soce code of this class using comand javap -c clsobj.class
//bellow is sorce code of this class 
//--here the clsobj(); is object created on heap section in bittwen this object constrctor is present and the instance nonstatic varaile address is string in constructor 
//--the name of object is  same as name of class 
//--in this look invokespecial this is metod that call to object cllass and object class is parent class of all the class and it return nething to call the obhect class super() method is used that is nothig but invokespecial 
//-- here bipush 10 is pusing or storing the 10 value in give instace vareble
//
/*
clsobj();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: return   */

	static int k =10000; //instace static vareable
			     //--this static bareable storig in static block in last line of all over the soure code
/*  static {};
    Code:
       0: sipush        10000
       3: putstatic     #26                 // Field k:I
       6: return */


	static void fun(){
	
	int y =100;     //local vareable
	
	}

	public static void main(String[] boss){
	
	int z =1000;                //local vareable
	System.out.println(z);
//	System.out.println(y);   //it gives error can not find symbol that is out of scope

	clsobj obj =new clsobj();  //we have create an object to acssece the non static vaireable 
	System.out.println(obj.x);   //x is instance vareible but it is non static 
	}


}
