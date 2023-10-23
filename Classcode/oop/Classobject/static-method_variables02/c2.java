class staticDemo{


	static int x = 10;
	static int y = 20;

	static void display(){
	
		System.out.println(x);
		System.out.println(y);
	}
}

class client{


	public static void main(String[] boss){
	
		System.out.println(staticDemo.x);  //if the vearible is satic then we can access them without creating  object 
						   //the resion is all static varible present in static block and this block is present in  metbod area
						   //when we call  to the static vaerable then its first call to Special structre of theat class and theis is allwas present in method area then this spesial structrer call to(pointer to static block) and bettewen them we know the static varaibles is present
						   //for this above proesses wee dosnt requre the object so... 
		System.out.println(staticDemo.y);

		staticDemo.display(); //this static method allso in metod area
	
	}

}
