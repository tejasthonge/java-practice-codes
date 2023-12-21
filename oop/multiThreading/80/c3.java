//#2.join() //join(long) :
//
//--by using join method then runing meain thread is to redy to run state and aleredy start method is collad whos thead class object creade give more pririty as comper to meain thread


class myThread extends Thread{

	myThread(String boss){
	
		super(boss);

	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	
		try{
		
			Thread.sleep(2000);
		
		}
		catch(InterruptedException obj){}
		System.out.println("in run"); 
	
	}
}

class ThreadDemo{

	public static void main(String[] boss)throws InterruptedException{

	
		myThread t0 = new myThread("boss-1");
	
		t0.start();
		t0.join();

		System.out.println(Thread.currentThread().getName());
	
	}



}

/*op:
boss-1
in run
main

note:as we call to start method thread t0 of is going ready run state as we main thread is also runing state after call join method he jvm gives priorty to t0 and main thread is going to rady to run state that quntum time thread-0 go to ready state but the join is said by meain thread so continiusly gives pririty to thread-0 antele anlese they not
*/
