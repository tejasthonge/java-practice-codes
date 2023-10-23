/*
 Method                         Description
 
newCachedThreadPool()             Creates a thread pool that creates new 
                                  threads as needed, but will reuse previously 
                                  constructed threads when they are available
 



1. Create a task(Runnable Object) to execute
2. Create Executor Pool using Executors
3. Pass tasks to Executor Pool
4. Shutdown the Executor Pool
 */




import java.util.concurrent.*;


class myThread implements Runnable{

	int num;
	myThread (int num){
		this.num=num;
	

	
	}
	public void run(){
	
		
		System.out.println(Thread.currentThread() + "startThread"+num);
		myThread.dailyTask();
		System.out.println(Thread.currentThread() + "endThread"+num);
	
	}
        static void dailyTask(){
	
		try{
			Thread.sleep(4000);

		}
		catch (InterruptedException obj)
		{
		}
	
	}

}


class MyThread{


	public static void main(String[] boss){
	
		ExecutorService ser = Executors.newCachedThreadPool();
	
		for(int i =1; i<=6;i++){
			myThread obj = new myThread(i);
		
			 ser.execute(obj);
		}
		ser.shutdown();
	}
	

}
