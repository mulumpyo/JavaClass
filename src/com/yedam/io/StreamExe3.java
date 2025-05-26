package com.yedam.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * 학생 ( 추가, 수정, 삭제, 목록 )
 * add		(추가 : 이름, 점수 입력)
 * modify	(수정 : 이름, 점수 수정)
 * remove	(삭제 : 이름)
 * list		(목록)
 * 
 * 종료시 저장
 */


public class StreamExe3 {
	
	static String path = "C:/temp/";
	static String fName = "studentList.txt";
	static String msgFmt = "==========\n1) 추가\n2) 수정\n3) 삭제\n4) 목록\n5) 종료\n==========\n선택 >> ";
	static String errorMsg = "1 ~ 5까지의 숫자를 입력해주세요.";
	
	static Scanner scn = new Scanner(System.in);
	static List<Student1> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			init();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			// 파일의 끝 부분에서 더 이상 읽을 값이 없음.
		}
		
		boolean run = true;
		
		while (run) {
			switch (selectNum(msgFmt)) {
			case 1:
				add();
				break;
			case 2:
				modify();
				break;
			case 3:
//				remove();
				break;
			case 4:
//				list();
				break;
			case 5:
				run = false;
				scn.close();
				save();
				break;
			default:
				sysout(errorMsg);
			}
		}
		sysout("프로그램 종료");
	}
	
	static void add() {
		String sno = input("학생번호");
		String score = input("점수");
		
		Student1 student = new Student1(
				Integer.parseInt(sno)
				,Integer.parseInt(score)
		);
		
		if (studentList.add(student)) {
			sysout("저장완료");
		}
		
	}
	
	static void modify() {
		int sno = Integer.parseInt(input("학생번호"));
		int score = Integer.parseInt(input("점수"));
		
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNo() == sno) {
				studentList.get(i).setScore(score);
				sysout("수정완료.");
				break;
			}
		}
	}
	
	static void save() {
		try {
			Writer writer = new FileWriter(path + fName);
			for (Student1 student : studentList) {
				String txt = student.getStudentNo() 
						+ " " 
						+ student.getScore()
						+ "\n";
				writer.write(txt);
			}
			writer.close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void init() throws IOException, NoSuchElementException {
		Scanner fScan = new Scanner(new File(path + fName));
		while (true) {
			String txt = fScan.nextLine();
			String[] strAry = txt.split(" ");
			
			studentList.add(
					new Student1(Integer.parseInt(strAry[0])
					, Integer.parseInt(strAry[1]))
			);
		}
	}

	public static String input(String msg) {
		System.out.print(msg + " >> ");
		return scn.nextLine();
	}
	
	
	
	public static int selectNum(String msg) {
		int selNum = 0;
		System.out.print(msg);
		try {
			selNum = Integer.parseInt(scn.nextLine());			
		} catch (NumberFormatException e) {
		} 
		return selNum;
	}
	
	public static void sysout(String msg) {
		System.out.println(msg);
	}
}
