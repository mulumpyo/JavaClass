package com.yedam.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExe2 {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			
			int menu = 0;
			
			System.out.println("(1) 메뉴 (2) 종료");
			System.out.print("선택 >>");
			
			while (true) {
				try {
					menu = Integer.parseInt(scn.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("메뉴를 다시 선택하세요.");
					System.out.println("(1) 메뉴 (2) 종료");
					System.out.print("선택 >>");
					continue;
				}
				break;
			}

			switch (menu) {
			case 1:
//				백업();
				break;
			case 2:
				run = false;
				scn.close();
				return;
			default:
				System.out.println("1 또는 2를 입력해주세요.");
			}
		}
	}
		
		
		
		
		
		
		
		
		
		// NullPointrException
		// NumberFormatException
		// ClassCastException
		// ArrayIndexOutOfBoundsException
		
//		String str = input("입력해라");
//
//		try {
//			sout(str.toString());
//			int num = Integer.parseInt("a");
//		} catch (NullPointerException | NumberFormatException e) {
//			soutln("뭐? Null이라고? Null 조져버릴 순 없잖니...");
//			str = "값";
//			soutln(str.toString());
//		} finally {
//			scn.close();
//		}
//		
//		soutln("end of prog.");
//	}
	
	
	
	
	
	static int intConvert(String str) {
		int result = Integer.parseInt(str);
		return result;
	}
	
	static String input(String str) {
		sout(str + " >> ");
		return scn.nextLine();
	}
	
	static void soutln(String str) {
		System.out.println(str);
	}
	
	static void sout(String str) {
		System.out.print(str);
	}
}