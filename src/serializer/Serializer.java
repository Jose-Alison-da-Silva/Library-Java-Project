package serializer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Serializer {
	private static BufferedReader bf;
	
	public static void saveString(String path, String string) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		fw.write(string + "\n");
		fw.close();
	}
	
	public static void readString(String path) throws IOException {
		FileReader fr = new FileReader(path);
		bf = new BufferedReader(fr);
		String line = bf.readLine();
		while(line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
	}
}
