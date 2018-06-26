
import java.io.*;
import java.util.*;

class CreateZipFile2 {

	
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
			
//			char ch = '1';
//			int y = ch;
//			System.out.println(y);
//			
//			y = 50;
//			ch = (char) y;
//			System.out.print(ch);
	

		FileInputStream fstream = new FileInputStream("/Users/Devonte1/Desktop/Javatest.txt");//Read in file
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));//Take file stream and place it into bufferedReader
		OutputStreamWriter bw = null;
	
		String strLine="";
		String removeSpace="";
		
		
		String st=removeSpace.replaceAll(" ", "");//Replace all spaces 
		char[]text = st.toCharArray();//Create new conjoined character array
		System.out.println("Character List");
		
		int [] count = new int [65536];//Character array
		
		//Create index 
			for(int x = 0; x < 256; x ++){
					count[x]=0;
			}
			
			while ((strLine = br.readLine()) != null) {

				removeSpace+=strLine;
				
			}
		
		//Search file 
		
		
		//
		for(int x = 0; x < 127; x++){
			char ch= (char) x;
			if (count[x] == 0){ 
				System.out.println("Character " + ch + " "+ "not used" + "  = (char code " + (int) ch + ")");
			}
			
//			else if (count[x] != 0){
//				System.out.println("Character " + ch + " used " + count[x] + " = (char code " + (int) ch + ")");
//			}
		}
		for(int x = 161; x < 256 ; x++){
			char ch= (char) x;
			if (count[x] == 0){ 
				System.out.println("Character " + ch + " "+ "not used" + "  = (char code " + (int) ch + ")");
			}
			
//			else if (count[x] != 0){
//				System.out.println("Character " + ch + " used " + count[x] + " = (char code " + (int) ch + ")");
//			}
		}
		
		}

}
//for(int counter =0; counter< text.length;counter++){
//	char ch= text[counter];
//	int count=0;
//	for ( int i=0; i<text.length; i++){
//		if (ch==text[i])
//			count++;
//	}
//	boolean flag=false;//Check all characters
//	for(int j=counter-1;j>=0;j--){
//		if(ch==text[j])
//			flag=true;
//	}
//	if(!flag){
//		System.out.println(bw  = new OutputStreamWriter(null, ch+" "+count));//Print out character and its count
//		br.close();//Close buffered reader
//	}
//}
//
//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
//
//}

