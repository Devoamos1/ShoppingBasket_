package characterCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {
	static public BufferedReader openReader(String fileName) throws IOException {
		return Files.newBufferedReader(Paths.get(fileName));
	}

	static public Writer openWriter(String fileName) throws IOException {
		return Files.newBufferedWriter(Paths.get(fileName));
	}

}