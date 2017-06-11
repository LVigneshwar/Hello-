import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("test.txt");
		System.out.println(f1.createNewFile());
		System.out.println("done");
	}
}
