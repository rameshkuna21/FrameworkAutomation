package july21st;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File f=	new File("D:\\K.Ramesh\\Selenium class\\abc.txt");
		
		f.createNewFile();
		
		System.out.println("End Of Program");

	}

}
