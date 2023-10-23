class myThread extends Thread{

	public void run(){
		
	/*	try{
		nmmain.join();}
		catch(InterruptedException obj){}*/
		for(int i=1;i<10;i++){
		System.out.println("in Thread-0");
		}
	
	}



}


class ThreadDemo{

	public static void main(String[] boss)throws InterruptedException {
	
		myThread t = new myThread();
		Thread nmmain =Thread.currentThread();
		t.start();
		t.join();
		
		for(int i =1;i<10;i++){
		
			System.out.println("in mainThread");
		}
	}



}
