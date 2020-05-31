package prjJavaFileIO;
import java.io.*;
import java.util.*;

public class randInts {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter max value");
    	int max = Integer.parseInt(scan.nextLine());
    	System.out.println("Enter how many per line");
    	int perLine = Integer.parseInt(scan.nextLine());
    	System.out.println("Enter total count");
    	int total = Integer.parseInt(scan.nextLine());
    	System.out.println("Enter file name");
    	String name = scan.nextLine();
    	Random r = new Random();
    	FileWriter fw = new FileWriter(name);
    	BufferedWriter bw = new BufferedWriter(fw);
    	for (int x = 0; x<total; x++) {
    		for (int y=0; y<perLine; y++) {
    			bw.writeLine((r.nextInt(max)-1)+"");
    		}
    		bw.writeLine(" ");
    	}
    }
}
