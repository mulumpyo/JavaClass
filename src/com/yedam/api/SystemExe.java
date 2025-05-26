package com.yedam.api;

public class SystemExe {
	public static void main(String[] args) {
		long time = (System.currentTimeMillis() / 1000);
		
		int yearsCalc = 60 * 60 * 24 * 36;



	}
	
	public static void exe() {
//		System.out.println("장비를 정지합니다.");
		long start = System.nanoTime(); //System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		}
		long end = System.nanoTime();
		System.out.println(sum + " " + (end - start));
		
	}
}