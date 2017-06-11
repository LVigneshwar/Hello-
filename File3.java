import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class File3 {
	public static void main(String[] args)
	{
		try
		{
			File f1 = new File("test11.txt");
			FileReader fr = new FileReader(f1);
			long len = f1.length();
			System.out.println(len);
			char x[] = new char[(int)len];
			fr.read(x);
			fr.close();
			System.out.println(x);
		} catch (IOException ex)
		{

			ex.printStackTrace();
		}

}
}

