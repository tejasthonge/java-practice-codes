//annotetion: --it is nothig but provide information about data means provoide meta data
//	      --it is just know the flow of code


class parent{

	void property(){
	
		int bal = 242132;
		System.out.println("total proparty in thousend :  "+bal);
	
	}

}

class child extends parent{

	@Override
	void property(){
	
		System.out.println("ballance is zero");
	
	}

}

class user{

	public static void main(String[] boss){
	
		parent papa = new child();
		papa.property();
	
	}


}
