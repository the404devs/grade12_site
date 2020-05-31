package prjJavaFileIO;
import java.io.*;//* means we want access to all the classes in the imported package



public class javaFileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";
		try {
			FileReader fr = new FileReader("phoneBook2018.csv");
			BufferedReader br = new BufferedReader(fr);		
			do {
				line = br.readLine();
				if (line != null)
				{
					//System.out.println(line);
					String[] info = line.split(",");
					if (info[0].equals("Ira Horne")) 
					{
						System.out.print("Ira's number is "+info[1]);
					}
				}
			}while(line != null);
			br.close();			
		}
		catch(IOException e) 
		{
			System.out.println("rip computer");
		}
		
	}

}
