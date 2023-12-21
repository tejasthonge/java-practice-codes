

class demo {

	int run(int r){
	
		return r;
	}






	float tempreture(float temp){
		System.out.println("tempreture :"+temp);
		return temp;
	
	}

	int digit(int di){
	
		System.out.println("digit no "+di);
		return di;
	
	}
	char alfabet(char alf){
	
		System.out.println("alfabet :"+alf);
		return alf;
	}
	




}

class remo extends demo{







}

class user{


	public static void main(String[] boss){
	
		demo obj = new remo();
		obj.run(302);//we gives int argumet it just for return but to print or show on screen we have to print like bellow
		System.out.println(obj.run(301));
	
		obj.digit(2);
		obj.tempreture(24.4f);
	
	}

}
