package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * Calendar: 날짜, 시간 관련.
 * Date: 날짜, 시간,
 */

public class CalendarExe {

	static Scanner scn = new Scanner(System.in);
	static String[] dayWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
	public static void main(String[] args) {
		int year = input("연도를 입력해주세요", 1);
		int month = input("월을 입력해주세요", 1);
		
		makeCalendar(year, month);
	}
	
	// 달력
	public static void makeCalendar(int year, int month) {
		calendarHeader(year, month);
		calendarMain(year, month);
		calendarFooter();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public static int input(String msg, int integer) {
		sysout(msg + " >> ");
		int result = 0;
		while (true) {
			try {
				result = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				sysoutln("숫자를 입력해주세요!");
			}			
		}
		return result;
	}
	
	public static String input(String msg) {
		System.out.print(msg);
		return scn.nextLine();
	}
	
	public static void sysoutln(String msg) {
		System.out.println(msg);
	}
	
	public static void sysout(String msg) {
		System.out.print(msg);
	}
	
	private static void calendarHeader(int year, int month) {
		System.out.printf("%s %d년 %02d월 %s\n", printShape("=", 14), year, month, printShape("=", 14));
		sysoutln(printDayWeek());
	}
	
	private static void calendarMain(int year, int month) {
		Calendar now = Calendar.getInstance();
		now.set(year, month - 1, 1);
		
		int startDay = now.get(Calendar.DAY_OF_WEEK); // 1일의 요일
		int endDate = now.getActualMaximum(Calendar.DATE); // 입력 월의 마지막날
		now.set(year, month - 1, now.getActualMaximum(Calendar.DATE));
		int endDay = now.get(Calendar.DAY_OF_WEEK);
//		sysout(startDay + " " + endDay + " " + endDate);
		
		for (int i = 0; i < endDate; i++) {
			if (i == 0) {
				for (int j = 0; j < startDay; j++) {
					sysout("   ");
				}
			}
			
			System.out.printf("%3d", i + 1);
			if (i % 7 == 0) {
				sysoutln("");
			} else {
				sysout("   ");
			}
		}
		
	}
	
	private static void calendarFooter() {
		sysoutln(printShape("=", 40));	
	}
	
	public static String printShape(String shape, int cnt) {
		String str = "";
		for (int i = 0; i < cnt; i++) {
			str += shape;
		}
		sysoutln("");
		return str;
	}
	
	public static String printDayWeek() {
		String str = "";
		for (int i = 0; i < dayWeek.length; i++) {
			str += dayWeek[i];
			if (i != (dayWeek.length - 1)) str += "   ";
		}
		return str;
	}
	
	
	
	
	
	
	public static void date() {
		Date today = new Date();
		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// yyyy-MM-dd HH:mm:ss
		
		String timeStr = sdf.format(today);
		System.out.println(timeStr);
		
		try {
			// 문자열을 날짜 형식으로 변환
			today = sdf.parse("2025-08-01 09:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);
	}
	
	public static void calc() {
		// 시스템의 현재 시간 마치 sysdate
		Calendar now = Calendar.getInstance();
		
		// 시간 설정
		now.set(2025, 0, 1);
		now.set(Calendar.YEAR, 2024);
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		
		switch (dayOfWeek) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		default: System.err.println("Error"); break;
		}
		
		
		System.out.printf("%d년 %d월 %d일 %d요일 말일: %d\n"
					, now.get(Calendar.YEAR)
					, now.get(Calendar.MONTH) + 1
					, now.get(Calendar.DATE)
					, now.get(Calendar.DAY_OF_WEEK)
					, now.getActualMaximum(Calendar.DATE)
			);
}
}
