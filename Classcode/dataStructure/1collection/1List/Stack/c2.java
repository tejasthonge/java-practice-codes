
import java.util.*;

class StackDemo{

	public static void main(String[] boss){
	
		Stack s = new Stack();
		for(int i =1; i<=7;i++){
		s.push("Stack Fram: "+ i);
		}
		System.out.println(s);
	
		for(int i=7;i>=4;i--){
		
			s.pop();
			System.out.println("Stack frame "+i+" poped");
		
		}
	
		System.out.println("remenig stack after pop" + s);
	}


}
