package com.yedam;

public class ObjectExe {
	public static void main(String[] args) {
		
		Calendar.output("Year 입력 >> ");
		int year = Calendar.inputInt();
		if (Calendar.isLeapYear(year)) {
			Calendar.output("윤년입니다.\n");
		} else {
			Calendar.output("평년입니다.\n");
		}
		
//		Calendar.output("Month 입력 >> ");
//		int month = Calendar.inputInt();
//		Calendar.showMonth(month);
	}
}