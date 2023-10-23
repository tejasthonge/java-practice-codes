

import java.net.*;
import java.io.*;
import java.awt.*;


class OpenWeb{

	public static void main(String[] boss)throws IOException{


		String url = "www.core2web.com";

		URI obj = new URI(url);

		Desktop desk = new Desktop.getDesktop();
		desk.browse(obj);
	

	
	
	}


}
