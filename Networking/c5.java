import java.net.*;
import java.io.*;

class server{

	public static void main(String[] boss)throws IOException{
	
		ServerSocket ss = new ServerSocket(1200);

		Socket s = ss.accsept();

		System.out.pritnln("connection establish !  don boss");

		OutPutStream os = s.getOutputStream();
		printStream ps = new printStream(os);
		ps.println("Hello client");
		ps.println("Go to Hell");
	
	}


}
