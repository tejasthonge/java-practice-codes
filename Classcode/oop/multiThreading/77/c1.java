//19 jully 
//
//multithreding are devlop for impove the prafomance of code or any prosses 
//--jvm is also work as a os the resine all the prosese are similar to the os like os hase cpu shedulare or jvm have 
//-- like any room have two wall and we have paint it by one painter the it take long time to complite the four wall but we divide the four wall into four painter the it take minimum time as commare to that
//--in java we have class and it have three methods supose fun gun run as respectily we call them in main method then its stack frame push one by one so it take large time 
//but we create multipule thread then it call same function at time 




//#their are to way to careate the thread 
//1.by using Thread class
//2.by using Runeable interface
//
//1.Thread class 
//--it is the child call of Runeable interface
//--that means method present in Runeble interface are override by Thread class
//--that method we call for creating the multiple thread
//
//--in Thread class have Thread cunstrutor and in bettwen them are call to parent class of that Thread class 
//--in thread class constructor have the call to the "vmcreate thread" method this call are used to create the thread 
//--#--life cycale of thread
//--afater carating thread this tread is just born or start state
//--we have to call the start method tho start or run the threas
//--affter that sleep stage by using obj.sleep(timeinms);
//--then dead state return main thread 
//
//
//#--->
//protocall to create the thread
//--their are two way 
//1.one is creating class having Thread class parent
//2.anather is by imliments the Runeble interfac
//--using 1 first we have extends the Thread class 
//--we must have override run metod present in Runeable interface(Runeable interface is parent of Thread class)
//--Creating object of that class -->born or start stage
//--call the start method as we call the start methed this method is present is thread class the overredean run method is strat to exucuting or rung witout call the call is start then run is atomaticly running -->start stage
//--all the code that we have to exucute in new threas must be present in run method this method is reuneable class abstract method that mens we must have to give them body
//--as we call to start method the it atomaticaly call the run method 



class MyThread extends Thread{   //to carat the thread we must exteds thiis 
				 //--all method are present in thread class 
				 //--that are requre to create the thread
				 //--start the thread or more
	public void run(){   //we not write public give veaker accesses privleage error the resion is the run method present in the Runeable interface is public or we can not redeuse their scope
	
		for (int i=0;i<10;i++){
		
			System.out.println("in run");
		
		}
	
	}
}


class ThreadDemo{

	public static void main(String[] boss){
	
		MyThread obj = new MyThread();//here hidden parametor is this is go to runable interface and then returns
	
		obj.start(); //this is thread class method and thread class is present in lang packege so we do not have to import them 

		for(int i= 0 ;i<10;i++){
		
			System.out.println("in main");
		}
	
	}

}

/*
 output is mixing to each other at time for loop present in main is runing in main thread or at that time run method is runing in Thread -0 and shows output in same window
 op-->
in main 
in main
in main
in run
in run
in run
in run
in run
in run
in run
in run
in run
in run
in main
in main
in main
in main
in main
in main
in main


 */
