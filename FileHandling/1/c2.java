
import java.io.*;

class FileDemo {

	public static void main(String[] bosss) throws IOException{
	
		File t = new File("NewFolder");

		t.mkdir();   //comade to create the folder
		
		File t2 = new File(t ,"text.txt");  ///by this constructor we fass one folder or sencond file inside them

		t2.createNewFile();
	
	
	}


}
