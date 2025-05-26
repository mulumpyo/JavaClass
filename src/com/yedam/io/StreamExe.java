package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamExe {
	static String path = "C:/temp/os1.db";
	static String pngPath = "C:/temp/";
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream(pngPath + "java.png");
			OutputStream os = new FileOutputStream(pngPath + "copy3.png");
			
			// 보조스트림 연결.
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			// 읽기 - 쓰기
			while (true) {
				int data = bis.read();
				if (data == -1) {
					break;
				}
				bos.write(data);
			}
			bos.close();
			bis.close();
			os.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		System.out.println("end of prog");
	}
	
	public static void copy() {
		// 입력 -> 출력.
		try {
			
			InputStream is = new FileInputStream(pngPath + "java2.png");
			
			OutputStream os = new FileOutputStream(pngPath + "copy2.png");
			
			
			byte[] buf = new byte[10];
			
			long start = System.currentTimeMillis();
			
			while (true) {
				int data = is.read(buf);
				System.out.println(buf);
				if(data == -1) {
					break;
				}
				os.write(buf);
			}
			os.close();
			is.close();
			
			long end = System.currentTimeMillis();
			
			System.out.println(end-start);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void read() {
		
		// 입력(파일) = 바이트 기반.
		try {
			InputStream is = new FileInputStream(path);
			// read() 1바이트씩 읽기 -1 반환
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void write() {
		
		// 출력(파일) = 바이트 기반.
		try {
			OutputStream os = new FileOutputStream(path);
			byte b1 = 10;
			byte b2 = 20;
			byte b3 = 30;
			
			os.write(b1);
			os.write(b2);
			os.write(b3);
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
