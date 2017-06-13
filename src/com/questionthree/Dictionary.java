package com.questionthree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class Dictionary {
	
	public static void doesFileExist(URL path) throws Exception{
		try {File f = new File(path.getFile());
		System.out.println("File exists");
		System.out.println("");

		} catch (Exception e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
	
		URL path = Dictionary.class.getResource("words.txt");
		String thisLine = null;
		doesFileExist(path);
		File f = new File(path.getFile());
		
		BufferedReader br = new BufferedReader(new FileReader(f));
			
		while ((thisLine = br.readLine()) != null){
			System.out.println(thisLine);
		}
	}
	
			
	}

