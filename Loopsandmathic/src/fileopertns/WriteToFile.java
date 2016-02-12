package fileopertns;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			String content = "VSB Engineering College";

			File file = new File("C:/deepthi/demo.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
