package com.yedam.exception;

public class ExceptionExe {
	public static void main(String[] args) {
		
		String numStr = "a";
		int num = 0;
		try {
			
			num = Integer.parseInt(numStr);
			
		} catch (NumberFormatException e) {
			
			// 예외가 발생하면 대처할 코드.
			
			System.out.println("에러 발생!! 비상비상비상비상 삐용삐용");
			
			
		}
		

		System.out.println(num);
		// 실행예외
		try {
			System.out.println(Class.forName("java.util.Scanner"));
		} catch (ClassNotFoundException e) {
			System.out.println("일반예외발생.");
		}
		System.out.println("end of prog.");
	}
}
