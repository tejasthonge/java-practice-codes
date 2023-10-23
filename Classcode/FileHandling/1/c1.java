

//FileHandling 
//
import java.io.*;

class FileDemo{

	public static void main(String[] boss) throws IOException{

		File t = new File("txt.txt");

		t.createNewFile();
	
		File t1 = new File("Folder", "txt1.txt");
		//t1.createNewFile();            
		t1.mkdir();
	
	}


}
