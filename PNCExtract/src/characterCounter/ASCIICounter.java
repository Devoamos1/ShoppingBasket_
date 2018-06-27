package characterCounter;

import java.io.*;

public class ASCIICounter implements Counter{
	private int [] count = new int [256];//Character array

	@Override
	public synchronized void count(BufferedReader[] readers, BufferedWriter writer) throws IOException {
		// TODO Auto-generated method stub

		for(BufferedReader reader: readers)
			counter(reader);
		writeResults(writer);
	}

	private void counter (BufferedReader reader) throws IOException {
		
		for(int x = 0; x < 256; x ++){
			count[x]=0;
		}
		
		String strLine;
		String removeSpace="";
		while ((strLine = reader.readLine()) != null) {

			removeSpace+=strLine;
		}
		
		
		String st=removeSpace.replaceAll(" ", "");//Replace all spaces 
		char[]text = st.toCharArray();//Create new conjoined character array
		System.out.println("Character List");
		
		//Search file and count characters
				for (int index = 0; index < text.length; index ++) {
					char ch = text[index];
					int y = ch;
					count[y]++;
				}

	}

	private void writeResults(BufferedWriter writer) throws IOException {
		
		for(int x = 0; x < 256; x++){
			char ch= (char) x;
			if (count[x] == 0){ 
				writer.write("Character " + ch + " "+ "not used" + "  = (char code " + (int) ch + ")");
			}

	}
	
	
	}

}



