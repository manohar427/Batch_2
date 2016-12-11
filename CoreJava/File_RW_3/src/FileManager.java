import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	public static void main(String[] args) {

		FileWriter fw = null;
		
		try {
			fw = new FileWriter("abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hi HEllow to All");
			bw.newLine();
			bw.write("Second Line here");
			bw.close();
			fw.close();
			
			System.out.println("Data written done.");
			
			//Read data
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new  BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) !=null)
			{
				System.out.println(line);
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
