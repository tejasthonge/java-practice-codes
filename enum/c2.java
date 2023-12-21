import java.util.*;

enum Demo{

	somavar,mangalvar,budhvar,guruvar,shukravar,shanivar,ravivar;


}

class demo{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any one day form(somavar,mangalvar,budhvar,guruvar,shukravar,shanivar,ravivar)");
		Object day = sc.next();


		int dayNo = Demo.day.ordinal();

		switch(dayNo){
		case 0: System.out.println("mahadev");
			break;
		case 1:System.out.println("maruti");
		       break;
		case 2:System.out.println("budhavar");
		       break;
		case 3:System.out.println("Chhtrapati");
		       break;
		case 4:System.out.println("Shukravar");
		       break;
		case 5:System.out.println("ShaniDev");
		       break;
		case 6:System.out.println("jotiba");
		       break;
		default :System.out.println("no such day");
		}
	}

}
