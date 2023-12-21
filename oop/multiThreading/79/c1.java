class Mythread extends Thread{
Mythread(){
	
		System.out.println("in  mythread constructor");
	}


	//System.out.println(Thread.currentThread().getName());    //we cant write any thing without any function
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	
	}

	

	public void start(){

	}
	
}

class ThreadDemo{

	public static void main(String[] boss){
	
		System.out.println(Thread.currentThread().getName());
		Mythread obj = new Mythread();
		obj.start();

	
	
	}


}
