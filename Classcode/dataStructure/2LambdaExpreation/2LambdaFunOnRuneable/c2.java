//Runnable interface :
//	--it  have only one method 
//	--so it is an functional interface
//	--so we can apply lambd function on run method present on it
//	--Runneable interface present in java.lang package we can access them uthout importing the lang is by defolt
//	--Runneable interface contain public abstrac void run() method 
class RunnableDemo{

	public static void main(String[] boss){
	
		Runnable ra = ()->{
		
			System.out.println(Thread.currentThread());   //this id body of run method of Runnable interface
		
		};

		Thread t1 = new Thread(ra);
		Thread t2 = new Thread(ra);
		Thread t3 = new Thread(ra);

		t1.start();
		t2.start();
		t3.start();

	
	}


}
