package characterCounter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class DevontesCounter implements Counter {

	@Override public void count(BufferedReader[] readers,  BufferedWriter writer) throws IOException{// TODO Auto-generated method stub
		
		char[] buff = new char [8];//Create an 8 character Array
		int length;//Create length variable 
		try (Reader reader = Helper.openReader("/Users/Devonte1/Desktop/Javatest.txt")){
			while((length = reader.read(buff)) >=0) {//Print out character for array size
				System.out.print("\nlength " + length);
				for(int i = 0; i<length; i++)
					System.out.println(buff[i]);
			}

		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass().getSimpleName() + "-" + e.getMessage());
		}
				int size = readers.length;
				for (int i=0; i<size; i++){
					
					char[] buffer = new char [8];//Create an 8 character Array
					int lengthy;
					BufferedReader reader = readers[i];
					while((lengthy = reader.read(buffer)) >=0) {//Print out character for array size
						System.out.print("\nlength " + lengthy);
						for(int b = 0; i<lengthy; i++)
							System.out.println(buffer[i]);
					}
					
				}
		
			}

}
