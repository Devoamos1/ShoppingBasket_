package characterCounter;

import java.io.*;

public interface Counter {
	
	/**
	 * Counts the number of occurrences of each ASCII character from the given file readers.
	 * @param readers {@code BufferedReader} objects for the files valid for counting.
	 * @param writer A {@code BufferedWriter} object to output the results.
	 * @throws IOException Thrown if there is a problem reading or writing to a file.
	 */
	public void count(BufferedReader [] readers, BufferedWriter writer) throws IOException;
	
	

}
