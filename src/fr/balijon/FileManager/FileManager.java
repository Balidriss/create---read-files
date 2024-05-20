package fr.balijon.FileManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	public static void main(String[] args) {
		try {
			String path = System.getProperty("user.dir") + "/output/filewriterresult.txt";
			new File(path.substring(0, path.lastIndexOf("/"))).mkdir();
			FileWriter fileWriter = new FileWriter(path, false);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("preferenceNewsletter=false");
			writer.newLine();
			writer.write("preferenceColor=#425384");
			writer.close();
			FileReader fileReader = new FileReader(path);

			BufferedReader reader = new BufferedReader(fileReader);

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
