//seting name to the thread
//note:
//--at time of thread creation name is set 
//-- the resone is thread starating and the posses is runing state that time we print the thread name is set let

class myThread extends Thread{

	public void run (){
	
		System.out.println(Thread.currentThread().getName());
	
	
	}
}
class ThreadDemo {

	public static void main(String[] boss)throws InterruptedException{
	
		myThread t = new myThread();
		t.start();
		t.sleep(1000);
		t.setName("boss");
		System.out.println(Thread.currentThread().getName());
	}
}

/*
 
note : run the code comiting the sleep or without commenting the sleep

--in any program sleep is used so name is seted but not show on screen so negales theis type of posiblity thread name is seted at thread cration time 
--cheak next code how the name is set at the thread cration time
 */ 
