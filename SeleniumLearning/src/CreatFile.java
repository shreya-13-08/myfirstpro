import java.io.File;
import java.io.IOException;

public class CreatFile {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\newfile.txt");
		boolean fav = file.createNewFile();
		if(fav)
		{
			System.out.println("New file created");
		}
		else
		{
			System.out.println("Not created");
		}
	}
}
