//sleep method :
//this method is used for to sleep the thread 
//parametor is long --milisecond

class myThread extends Thread {


	public void run(){
	
		for (int i= 0; i<11;i++){
		
			System.out.println("in run");
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException obj){
			
			}
		}
	
	}

}


class ThreadDemo{

	public static void main(String[] boss) throws InterruptedException {
	
		myThread obj =new myThread();
	
		obj.start();

		for(int i= 1;i<11;i++){
			System.out.println("in main");	
			Thread.sleep(1000);
		}
	}
}


