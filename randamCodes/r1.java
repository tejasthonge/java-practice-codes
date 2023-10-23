class myThread extends Thread{

	public void run(){
	
		System.out.println("in thread run method");
	
	}
}

class r1{

	public static void main(String[] boss){
		

		myThread obj = new myThread();//as we create thead class object it call to thread clas vmcreate thrad method present in construcor of Thread class	
		obj.start();
	
	}


}


