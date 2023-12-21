

//# Creating Thread using Runeable interface
//(Runable interface  > Thread class)
//

class myThread implements Runnable {
	public void run(){
	
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	}
}


class ThreadDemo{


	public static void main(String[] boss){
	
		myThread obj = new myThread();
		Thread t = new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());
	
	}

}
