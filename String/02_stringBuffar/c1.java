class stringBuffarDemo{

	public static void main(String[] boss){
	
		StringBuffer sb = new StringBuffer("amar boss"); //by tis way  we can define StringBuffer 
								
		System.out.println(sb);
		
//		StringBuffer sb1 = "amar boss";  //this gives error :string can not be converted into string buffer
		String sb1="iam hindu a mad mad hindu";			

		//the big reseson of to include sb in java that is we know that String are immutebe (can not be changed) 
		//-to solve this problem StringBuffar is intridused in java in java 1.0 version 
		//- that means sb is mutubale (can be changed further)
		//

		StringBuffer sb2 = new StringBuffer();


		//capacity 
		//-the deforlt1 capacity that is storing the charctor in stringBuffer is 16 if we do not pass any charector in sb
		//-if we passes charector in defing state than capacity is no of char passing to the sb + 10
		//-if same resion the first intilising capacity is full then the capacity will incrised withot creating new object in heap
		//-the formula for this is
		//=current_capacity + 1 * 2
		//
		System.out.println(sb.capacity());  //her the no of charector ing stingbuffer is "amar_boss"  9
						    //when we print sb.caapacity() then it print no charector in StirngBuffar + 16 that is equals to 25 so it print 25
						 

		System.out.println(sb2.capacity()); //StingBuffer sb2 is emty so it print by deforlt capacity that is 16
		
		sb2.append("amarBoss");  //it is method in StingBuffer class like as concate methode in String class

		System.out.println(sb2);
		System.out.println(sb2.capacity());  //when we add 8 charector the capacity of sb2 is remain same the resion is more 8 charector is set in it wethout any problems 
						     //-so capacity not incrised 
						     //-if we pass one more string having 9 no of charector then the capacity will incrised by formula that cc+1*2
						     //- so the the capacity will be 34 
						     //-cheak it


		sb2.append("hinduMaratha");        //we adding futhe 12 ellemet , so it does not create new object it will increse theire capacity ie 34
		System.out.println(sb2);
		System.out.println(sb2.capacity());  //34

		StringBuffer sb3 = new StringBuffer(100);  //by this way we can  initionlez the capacity 
	        System.out.println(sb3.capacity());

		//-in StringBuffer class we can pass parametor as a sting 
		sb3.append(sb1);
		System.out.print(sb3);
	}



}
