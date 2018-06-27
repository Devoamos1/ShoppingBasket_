package characterCounter;

import java.io.*;
import java.util.*;

class CountCharactersFromFile {

	
	public static void main(String[] args) {
			try {
				CharacterCounter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getClass().getSimpleName() + "-" + e.getMessage());//Throws nice output message 
		
			}
//		DevontesCounter dvc = new DevontesCounter();
//		
//		dvc.count(readers, writer);
	
			// TODO Auto-generated catch block
		
	}
			
		private static void CharacterCounter() throws IOException{

		FileInputStream fstream = new FileInputStream("/Users/Devonte1/Desktop/Javatest2.txt");//Read in file
		
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));//Take file stream and place it into bufferedReader
		OutputStreamWriter bw = null;
	
		
		
		String strLine;
		String removeSpace="";
		while ((strLine = br.readLine()) != null) {

			removeSpace+=strLine;
		}
		
		String st=removeSpace.replaceAll(" ", "");//Replace all spaces 
		char[]text = st.toCharArray();//Create new conjoined character array
		System.out.println("Character Total");
		for(int counter =0; counter< text.length;counter++){
			char ch= text[counter];
			int count=0;
			for ( int i=0; i<text.length; i++){
				if (ch==text[i])
					count++;
			}
			boolean flag=false;//Check all characters
			for(int j=counter-1;j>=0;j--){
				if(ch==text[j])
					flag=true;
			}
			if(!flag){
				System.out.println(bw  = new OutputStreamWriter(null, ch+" "+count));//Print out character and its count
				br.close();//Close buffered reader
			}
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
		
	}
		
	
	
}