package characterCounter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class CharacterCounterMock {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		count();
	}
	
	
	public static void count() throws IOException {
		
		/*In general, each read request made of a Reader causes a corresponding read request to be made of the 
		 * underlying character or byte stream. It is therefore good practice to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,
		 */
		try {
			FileReader reader;
			reader = new FileReader("/Users/Devonte1/Desktop/Javatest.txt");
		
		BufferedReader bufferedReader = new BufferedReader(reader);

		File outputFile = new File("/Users/Devonte1/Desktop/Javatest2.txt");
		BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(outputFile));
		  //bw.write(mycontent);
		
		String concatLine="";
		String removeSpace="";
		
		//Concatenate all lines
		while ((concatLine = bufferedReader.readLine()) != null) {

			removeSpace+=concatLine; 
		}	
		//Replace all spaces to avoid counting spaces
		String st=removeSpace.replaceAll(" ", "");
		
		//Create new conjoined character array
		char[]text = st.toCharArray();
		System.out.println("Character Total");
		bufferwriter.write("Character total");
		//Loop through array 
		for(int character = 0; character< text.length;character++){
			//Do count
			char ch = text[character];
			int count=0;
			for (int i=0; i<text.length; i++){
				if (ch==text[i])
					count++;
			}
			boolean flag=false;//Check all characters
			for(int j=character-1;j>=0;j--){
				if(ch==text[j])
					flag=true;
			}
			if(!flag){//If character = 0
				System.out.println(ch +" "+ " "+count);//Print out character and its count
				bufferwriter.write(ch +" "+count);
				bufferedReader.close();//Close buffered reader
			}
		}
		//After count output to writer
		bufferwriter.flush();
		bufferwriter.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	
}
