
class Demo{
	int x = 10;
	private int y =20;
	static int z= 30;

	void disp(){
	
	//	Demo obj = new Demo();
		System.out.println(x);
		System.out.println(y);
		System.out.println(Demo.z);
	
	}
}

class user {

	public static void main(String[] boss){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.disp();

		System.out.println("__________");
		obj1.x= 100;   //here x is instans or non-static so change in only obj1 not in obj2
		obj2.z=300;   //here z is static so change is shown in obj1 also


		obj2.disp();
		obj1.disp();
	}



}
