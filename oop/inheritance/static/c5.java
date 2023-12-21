class parent{

	int x = 10;
	static int y =20;
	parent(){
	
		System.out.println("in parent constructor");
	}

}
class child extends parent{

	int x =100;
	static int y = 200;
	child(){   //here headan parametor is this
	
		System.out.println("in child constructor");
	}
	void access(){
	
		System.out.println(x);   //as we printing the x or y it print child class x not the parent class x and y
		System.out.println(y);
	
		System.out.println(super.x);   //but due to this super we can acceses the parent class vareable or methods
		System.out.println(super.y);

		System.out.println(this.x);   //but by usint this we print the child class vareables and method 
		System.out.println(this.y);
	}


}

class client{

	public static void main(String[] boss){
	
		child obj = new child();
		obj.access();
	
	
	}



}

/*
 out put:--->

in parent constructor
in child constructor
100
200
10
20
100
200

 */
