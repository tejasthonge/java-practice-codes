

class myThread extends Thread{

	myThread(String str){
	
		//we have pass the parameter to the or string to the Thread call 
		//--in thread class have Thread(String tname)  constructor who set the name of thread
		super(str);
	
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	
	}
}

class ThreadDemo{

	public static void main(String[] boss)throws InterruptedException{

	myThread t = new myThread("Thread name");	//this passing parametor is nething but name of the created thread 
	
	Thread.sleep(10000);

	t.start();
	}

}
