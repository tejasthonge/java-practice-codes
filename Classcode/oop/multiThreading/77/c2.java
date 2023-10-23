class myThread extends Thread{

	public void run(){
	
		for(int i =0;i<20;i++){
		
			System.out.println("in run");
			try{
			
				Thread.sleep(1000);
			}
			catch(InterruptedException o){

			}

		}
	
	}


}

class ThreadDemo{


	public static void main(String[] boss)throws InterruptedException{  //we call sleep method it throwa this exeption we have throws them thir are two one is this or anather is try catch

		myThread obj = new myThread();
		obj.start();
		for(int i = 0;i<20;i++){
		
			System.out.println("in main");
			Thread.sleep(1000); //sleep the curent thread for one sec 
		}
		
	}
}
