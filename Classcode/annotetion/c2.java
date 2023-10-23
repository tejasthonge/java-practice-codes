

class parent{

	void property(){
	
		int bal = 242132;
		System.out.println("total proparty in thousend :  "+bal);
	
	}

}

class child extends parent{

//	@Override
	int property(){
	
		System.out.println("ballance is zero");
		return 0;	
	}

}

class user{

	public static void main(String[] boss){
	
		parent papa = new child();
		papa.property();
	
	}


}
