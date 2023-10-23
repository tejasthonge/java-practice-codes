

import java.net.*;
import java.io.*;
class URLDemo{

	public static void main(String[] boss)throws IOException{
	
		//URL : https://www.core2web.in

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the URL like :https://www.core2web.com");
		String url = br.readLine();
		
		URL obj = new URL(url);

		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());

	
	
	}

}
