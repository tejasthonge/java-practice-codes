//headdin this refarance


class Demo{

	int x= 10;
	Demo(){  // in in no argument Construcor the headean parametor is this like--> Demo(this) 
	
		System.out.println("in no-args constrautor");

	
	}
	public static void main(String[] boss){
	
			Demo obj =new Demo(); //here Demo() is pasing the obj like --> Demo(obj) 
						//--as we crating the object the implictaly calling to the constuctor of that class
						//--when we do not creat the constucor then the compalar automaticaly add in byte code 
						//--the name of constuctor and class name is same 	
	
	}


}
/*
output: in no args construtor

--that mens when we create an object of that demo class then the compalare or jvm inmpicetaly callling to the construcoter 
--this call is due to this refance 
--this  "this" is not shown that is callaled headan this rafarance
--*/
