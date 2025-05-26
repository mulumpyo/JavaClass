package com.yedam;

import java.util.Scanner;

public class Calendar {
	
	static ObjectExe oe = new ObjectExe();
	static Scanner scn = new Scanner(System.in);
	
	static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			}
		}
		return false;
	}
	
	static void showMonth(int month) {
		int start = StartDay(month);
		
		output(start + "\n");
		output(line("=", 11) + " " + month + "월 " + line("=", 11) + "\n");
		output("Sun Mon Tue Wed Thu Fri Sat\n");
		output(line("=", 27) + "\n");
	}
	
	public static int inputInt() {
		return Integer.parseInt(scn.nextLine());
	}
	
	public String userMessage(String msg) {
		output(msg);
		return scn.nextLine();
	}
	
	public static void output(String msg) {
		System.out.print(msg);
	}
	
	public static String line(String txt, int cnt) {
		String str = "";
		for (int i = 0; i < cnt; i++) {
			str += txt;
		}
		return str;
	}
	
	public static int StartDay(int m) {
		switch (m) {
		case 1:
			return 3;
		case 2:
			return 6;
		case 3:
			return 6;
		case 4:
			return 2;
		case 5:
			return 4;
		case 6:
			return 0;
		case 7:
			return 2;
		case 8: 
			return 5;
		case 9:
			return 1;
		case 10:
			return 3;
		case 11:
			return 6;
		case 12: 
			return 1;
		default:
			output("1 ~ 12 사이의 숫자를 입력해주세요.\n");
		}
		return 32;
	}

	
}
