package com.yedam.api;

import java.util.Scanner;

public class StringExe {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		getGender();
		
		String[] file = {
			"F:/img/고양이_사진.jpg"
			, "C:/temp/img.jpeg"
			, "D:/img/thisispngfile.png"
			, "D:/storage/umZzal.gif"
		};
		
		fileFormat(file);
	}
	
	static void fileFormat(String[] file) {
		System.out.println();
		for (String fileName : file) {
			String msg = fileName.substring(fileName.lastIndexOf("/") + 1);
			msg += " 파일의 확장자는 ";
			msg += fileName.substring(fileName.indexOf('.') + 1);
			msg += "입니다.";
			System.out.println(msg);
		}
	}
	
	static void getGender() {
//		System.out.println("주민등록번호 7자리를 입력하세요.");
//		String input = scn.nextLine()
		String[] birth = {
				"001119-3"
				, "991206-2"
				, "070811 4"
		};
		
		
		
		char sex = birth.charAt(index);
		
		if (isMale(sex)) {
			System.out.println(input + "는(은) 남자입니다.");
			return;
		}
		System.out.println(input + "는 여자입니다.");
	}
	
	static boolean isMale(char sex) {
		if(sex == '1' || sex == '3') {
			return true;
		}
		return false;
	}
}

