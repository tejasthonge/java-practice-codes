//overloding 


import java.util.*;

class IPL{

	void matchInfo(String team1 , String team2){
		
		System.out.println(team1 +" vs "+team2);
		
	}

	void matchInfo(String team1 ,String team2 ,String venue){
	
		System.out.println(team1+" VS "+team2 + " loction is : "+ venue);
	
	}



	public static void main(String[] boss){
	
	
		IPL ipl2023 = new IPL();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter team one");
		String t1 = sc.next();

		System.out.println("enter team two");
		String t2 = sc.next();
	
		ipl2023.matchInfo(t1,t2);

		System.out.println("enter the match loction");
		String loc = sc.next();
		ipl2023.matchInfo(t1,t2,loc);
	
	
	}

}

//--for over loding single methods but diffarent parametor 
//--that is method name same but method signeture is diffarent 
//--
