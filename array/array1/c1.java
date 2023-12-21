
class c1{
   
	int a =20;               //globle non-static vairable
	static int b=30;         //globle static vaireable


	public static void main(String[] boss){
	
		int c = 50;     //local vaireable

//		System.out.println(a);  //it give error non static vaiareable can not be refrale from static context
		System.out.println(b);
		System.out.println(c);
		c1 obj= new c1();           //to create an object to accses non static method or variaeble
		System.out.println(obj.a);
	
	}






}







