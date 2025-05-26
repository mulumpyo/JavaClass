package com.yedam.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StreamExe2 {
	
	static String path = "C:/temp/writer.txt";
	
	public static void main(String[] args) {
		Scanner scn = null;
		try {
			scn = new Scanner(new File(path));
			while (true) {
				String data = scn.nextLine();
				String[] dataSplit = data.split(" ");
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			scn.close();
		}
		System.out.println("end of prog");
	}
	
	public static void read() {
		try {
			Reader reader = new FileReader(path);
			while (true) {
				int data = reader.read();
				if (data == -1) {
					break;
				}
				System.out.println((char) data);
			}
			reader.close();
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write() {
		
		// char 기반의 출력 스트림.
		try {
			Writer wr = new FileWriter(path);
			wr.write('A');
			wr.write('B');
			wr.write('C');
			wr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
