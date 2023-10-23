class myThread implements Runnable{

	public void run(){
	
		System.out.println("in run");
	
	}
}

class r2 {

	public static void main(String[] boss){
	
	
		myThread obj = new myThread();
		Thread t =new Thread(obj);
		t.start();
	
	}




}
