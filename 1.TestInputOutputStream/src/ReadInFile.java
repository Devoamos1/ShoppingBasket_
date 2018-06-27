import java.io.*;

public class ReadInFile {
	public static void main(String [] args) {//Next do try with Resources to auto close try

		// The name of the file to open.
		String fileName = "/Users/Devonte1/Desktop/SQLcommands.txt";

		// This will reference one line at a time
		String line = null;

		try {FileReader fileReader = new FileReader(fileName);// FileReader reads text files in the default encoding.

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);// BufferedReader reads text files in the default encoding.

			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);//Print each line 
			}   

			// Always close files.
			bufferedReader.close();         
		}
		catch(FileNotFoundException ex) {
			System.out.println(
					"Unable to open file '" + 
							fileName + "'");                
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '" 
							+ fileName + "'");                  
			// Or we could just do this: 
			// ex.printStackTrace();
		}
	}
}