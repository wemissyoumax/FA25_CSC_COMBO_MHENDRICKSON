import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
	
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			System.out.println("What is the file you would like to work with?");
			String fileName = input.next();
			input.nextLine();
			createFile(fileName);
			System.out.println("What do you want to write to the file?");
			String str = input.nextLine();
			writeFile(fileName, str);
			
			System.out.println("What do you want to append to the file?");
			String str2 = input.nextLine();
			appendTo(fileName, str2);
			
			Scanner myReader = new Scanner(fileName);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
		}

		private static void appendTo(String fileName, String str2) {
			try {
				FileWriter myWriter = new FileWriter(fileName, true);
				myWriter.write("\n");
				myWriter.write(str2);
				System.out.println("Appended successfully.");
				myWriter.close();
			} catch (IOException e) {
				System.out.println("There was an error appending to the file.");
				e.printStackTrace();
			}
			
			
		}

		private static void writeFile(String name, String strToWrite) {
			try {
				FileWriter myWriter = new FileWriter(name);
				myWriter.write(strToWrite);
				System.out.println("Written successfully.");
				myWriter.close();
			} catch (IOException e) {
				System.out.println("There was an error writing the file.");
				e.printStackTrace();
			}
			
		}

		private static void createFile(String fileName) {
			try {
				File myFile = new File(fileName);
				if(myFile.createNewFile()) {
					System.out.println("File created successfully.");
				} else {
					System.out.println("File " + myFile.getName() + " already exists.");
				}
			} catch (IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
			}
			
		}
	}


