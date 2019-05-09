package gclab17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import Fileiodemo.Student;

public class CountriesTextFile {

	public static void writeToFile(Country countries ) {
		String fileName = "countries.txt";
		
		File file = path.toFile();
		PrintWriter output = null;

		try {
			Path path = Paths.get(fileName);

			output = new PrintWriter(new FileOutputStream(file, true));

			
				output.println(countries);
			
				output.close();
				
		} catch (FileNotFoundException e) {
			Path path = Paths.get("countries.txt");
			try {
				Files.createFile(path);
				System.out.println("The file was created successfully!");
			}catch (IOException e1) {
			e1.printStackTrace();
		} 

			
		}
	}

	public static void readFromFile() {
		String file = "countries.txt";
		Path filePath = Paths.get(file);

		File f = filePath.toFile();
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);

				line = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found...");

		} catch (IOException e) {
			System.out.println("Please contact support for help.");

		}
	}
}
