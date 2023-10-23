

class ThreadGroupDemo extends Thread{

	ThreadGroupDemo(ThreadGroup g,String n){
	
		super(g,n);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
	
	}
}

class ThreadDemo{

	public static void main(String[] boss){
	

		ThreadGroup g = new ThreadGroup("menu");

		ThreadGroupDemo t1 = new ThreadGroupDemo(g,"home");
		ThreadGroupDemo t2 = new ThreadGroupDemo(g,"blog");
		ThreadGroupDemo t3 = new ThreadGroupDemo(g,"contect");

		t1.start();
		t2.start();
		t3.start();

	}


}
