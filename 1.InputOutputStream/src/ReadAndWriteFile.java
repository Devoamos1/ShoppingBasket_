import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadAndWriteFile {


	public static void main(String[] args) {
		//doTryWithResources();
		doTryWithResourcesMulti();
	}

	public static void doTryWithResources(){
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

	}
	
	public static void doTryWithResourcesMulti(){
		char[] buff = new char [8];
		int length;
		try (Reader reader = Helper.openReader("/Users/Devonte1/Desktop/Javatest.txt");//Method declared in writer class
			 Writer writer = Helper.openWriter("/Users/Devonte1/Desktop/Javatest2.txt"))
		{
			while((length = reader.read(buff)) >=0) {//No loop print old resource into new resource
				System.out.print("\nlength " + length);
				writer.write(buff, 0, length);//Write characters(buff) starting from first to length
			}

		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass().getSimpleName() + "-" + e.getMessage());
		}

	}
}
