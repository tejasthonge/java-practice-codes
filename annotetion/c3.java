

class parent{

	void property(){
	
		int bal = 242132;
		System.out.println("total proparty in lak :  "+bal);
	
	}

}

class child extends parent{

	@Override
	void property(int s){
	
		System.out.println("ballance is zero");
	
	}

}

class user{

	public static void main(String[] boss){
	
		child papa = new child();
		papa.property(11);
		
		parent baba = new child();
		baba.property();
	}


}
