package prjJavaFileIO;
import java.io.*;

public class IO_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw;
		try {
			fw = new FileWriter("highscores.gbj", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Kevin McMemes, 69696969696969420\r\n");
			bw.close();
			System.out.println("it worked");
		} catch (IOException e) {
			System.out.println("oof");
		}
	}

}
