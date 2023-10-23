


class parent {


	parent(){
	
		System.out.println("in parent condtructor");
	
	}
        void poperty(){


               System.out.println("gold , car , vavar , home ");


        }
	void marry(){
	
		System.out.println("mamachi poragi");
	
	
	}
	
}

class child extends parent{


	child(){
	
		System.out.println("in child construcotor");
	
	
	}

       
	void marry(){
	
	
		System.out.println("mi patavleli poragi");
	
	
	}

}


class client{


	public static void main(String[] boss){
	
	

		parent obj = new child();
		obj.marry();	
		obj.poperty();
	
	}



}
