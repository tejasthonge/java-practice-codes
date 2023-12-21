//ThreadGroup:


class myThread extends Thread{

	
	myThread(ThreadGroup g,String str){
	
		super(g,str);
		
		
	}
	public void run(){
	
		System.out.println(getName());  //printing the thread name
		System.out.println(Thread.currentThread()); //printing the current Thread [Thread_name , priority ,ThreadGroup]
		System.out.println(Thread.currentThread().getThreadGroup());  //printing only thread group or thread group max pirority
	
	}
}

class ThreadDemo{

	public static void main(String[] boss){
		ThreadGroup g = new ThreadGroup("ThreadGroup_name");  //creating the threadGroup 
		
		myThread obj = new myThread(g,"userThreadname"); //passing the thread group as well thead name as a parametor 
		obj.start();
	}

}
