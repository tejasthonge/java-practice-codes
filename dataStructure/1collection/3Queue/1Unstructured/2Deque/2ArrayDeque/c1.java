

/*
 
##Deque(I):
	#ArrayDeque:

	--order is remain same 

methods :
	offerFirst();
	offerLast();

	peekFirst();
	peekLast();

	iterator()
	dessendingIterator()



 */


import java.util.*;

class DequeDemo{

	public static void main(String[] boss){
	
		Deque dq = new ArrayDeque();

		dq.offer(46);
		dq.offer(20);
		dq.offer(35);
		dq.offer(10);
		System.out.println(dq);

		//offerFirst
		//offerLast
		dq.offerFirst(100);
		dq.offerLast(1000);
		System.out.println(dq);
	
		//pollFirst()
		//pollLast()
		dq.pollFirst();
		dq.pollLast();
		System.out.println(dq);


		//peekFirs()
		//peekLast()
		dq.peekFirst();
		dq.peekLast();
		System.out.println(dq);

		//iterator 
		Iterator itr1 = dq.iterator();

		while(itr1.hasNext()){
		
			System.out.println(itr1.next());
		}

		//dessendingIterator


		Iterator itr2 = dq.descendingIterator();

		while(itr2.hasNext()){
		
			System.out.println(itr2.next());
		
		}
		
	}


}
