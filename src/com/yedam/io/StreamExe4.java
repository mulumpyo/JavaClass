package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * 객체 입출력 스트림
 * 기본타입 - 참조타입
 * int num = 10;
 * Member member = new Member();
 * 직렬화 (Serialization) : 객체 => 기본
 * 역질렬화 (Deserialization) : 기본 => 객체
 * Serializable 인터페이스 구현 클래스.
 * 
 */

class Product implements Serializable {
	String pCode;
	
	public Product(String pCode) {
		this.pCode = pCode;
	}
}

public class StreamExe4 {
	static String path = "C:/temp/";
	static String fName = "object.db";
	
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream(path + fName);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			List<Product> list = (List<Product>) ois.readObject();
			for (Product product : list) {
				System.out.println("상품코드 :" + product.pCode);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end of prog.");
	}
	
	static void serial() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("P001"));
		list.add(new Product("P002"));
		
		try {
			// 기본스트림
			OutputStream os = new FileOutputStream(path + fName);
			// 객체 입출력 보조 스트림
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			oos.writeObject(list); // 객체 전달
			oos.close();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
