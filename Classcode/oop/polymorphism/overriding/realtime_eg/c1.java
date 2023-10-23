//overriding
//
//--realtyme example of overriding



class match {


	void matchType (){
	
		System.out.println("T20/ODI/Test");
	}
	void ballCol(){
	
		System.out.println("White or Red ");
	}

}
class iplMatch extends match{

	void matchType(){
	
		System.out.println("T20");
	}
	void ballCol(){
	
		System.out.println("white");
	}

}

class testMatch extends match{

	void matchType(){
	
		System.out.println("Text");
	
	}
	void ballCol(){
	
		System.out.println("Red");
	
	}
}

class client{

	public static void main(String[] boss){
	
	
		match ipl = new iplMatch();
		ipl.matchType();
		ipl.ballCol();

		match test = new testMatch();
		test.matchType();
		test.ballCol();
	}

}
