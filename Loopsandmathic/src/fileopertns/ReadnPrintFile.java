package fileopertns;
import java.io.FileReader;
import java.io.IOException;
public class ReadnPrintFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            FileReader reader = new FileReader("C:/deepthi/demo.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	
}
