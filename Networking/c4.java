import java.io.*;
import java.net.*;
import java.util.*;
class Demo{

	public static void main(String[] boss) throws IOException,MalformedURLException{
	
		URL obj = new URL("https://www.core2web.in");
		URLConnection can =obj.openConnection();
		System.out.println("class modified :  " + new Date(can.getLastModified()));
	
	}




}
