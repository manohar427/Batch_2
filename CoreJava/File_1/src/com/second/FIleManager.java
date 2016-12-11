package com.second;

import java.io.File;
import java.io.IOException;

public class FIleManager {
	
	public static void main(String[] args)throws IOException {
        //File Create 
		File file = new File("xyz1.txt");
		try {
			boolean flag = file.createNewFile();
			if(flag){
				System.out.println("FIle is created");
			}else{
				System.out.println("File is not created");
			}
			
		} catch (IOException e) {
			throw e;
		}
		
		//Directory Create 
				File file1 = new File("Test1");
				boolean flag = 	file1.mkdir();
				if(flag){
					System.out.println("Folder is created");
				}else{
					System.out.println("Folder is not created");
				}
				
	}

}
