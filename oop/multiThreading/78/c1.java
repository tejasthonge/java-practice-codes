//why start method of thread class is not overreden by user

class myThread extends Thread{

	public void run(){
	
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	
	}

	public void start(){
	
		System.out.println("in my thread start");
		run();
	}
}

class ThreadDemo{

	public static void main(String[] boss){
	
		myThread obj= new myThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());


	}

}

/*
 op-->
in my thread start
in run
main
main

note:new thread is created but the function start is call to the mythread class start method not call to Thread class start method
 */
