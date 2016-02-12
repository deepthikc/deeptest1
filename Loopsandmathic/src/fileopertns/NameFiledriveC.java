package fileopertns;

import java.io.File;

import java.io.IOException;

public class NameFiledriveC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/deepthi/demo.txt");
		 boolean blnCreated = false;
		
		 try{
			 blnCreated = file.createNewFile();
		 }
		 catch(IOException ioe){
			 System.out.println("Error while creating a new empty file :" + ioe);
		 }
		 System.out.println("Was file " + file.getPath() + " created ? : " + blnCreated);
	}

}
