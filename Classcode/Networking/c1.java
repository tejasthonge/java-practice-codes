import java.net.*;
import java.io.*;

class IPAdrass{

	public static void main(String[] boss)throws IOException{

	
		
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter server Name : ");

			String site = br.readLine();

			InetAddress ip = InetAddress.getByName(site);

			System.out.println("IP Address : " + ip);
		
		
		
	

	
	}




}
