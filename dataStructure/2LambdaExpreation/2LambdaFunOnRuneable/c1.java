





class RunnableDemo{

	public static void main(String[] boss){
	
		Runnable ra =  ()->{
		
			System.out.println("int run method");


		};
	
		Thread t1 = new Thread(ra);
		t1.start();
	}

}
