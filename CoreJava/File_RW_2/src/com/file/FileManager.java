package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {

	public static void main(String[] args) {
     //1.Create file+write data
		try {
			
			String data = "Hi Hellow to All";
			String data1 = "Abc";
			byte all[] = data.getBytes();
			byte all2[] = data1.getBytes();
			
			FileOutputStream fos = new FileOutputStream("abc.txt");//create file
			fos.write(all);	//write data 
			fos.write(all2);	//write data 
			fos.close();
			System.out.println("File creation is done and with Data");	
			
			//Read the Data
			FileInputStream fip = new FileInputStream("abc.txt");
			int i = 0;
			while((i=fip.read())!=-1)//123,345,-1
					{
				System.out.print((char)i);
					}
			fip.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//2.Read the Data
	}
}
