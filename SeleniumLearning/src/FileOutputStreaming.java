import java.io.*;
public class FileOutputStreaming {

	public static void main(String[] args) {
		try {
			FileOutputStream foutst = new FileOutputStream("D:\\foutst.txt");
			String stream = "I am learning java n selenium";

			byte b[] = stream.getBytes();
			foutst.write(b);
			foutst.close();
			System.out.println("Success");
		}
		catch(IOException io)
		{
			System.out.println("couid not write to file");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
