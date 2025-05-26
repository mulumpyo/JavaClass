package com.yedam.api;

public class WrapperExe {
	
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = new Integer(20);
		Integer num3 = 30;
		System.out.println(num3);
		
//		num.intValue(); 불가능
		
		String str = "10";
		num = Integer.parseInt(str);
		
		double num4 = Double.parseDouble(str);
		
		num4 = Float.parseFloat(str);
		
		
		Integer num5 = new Integer(10); // 기본타입 => 참조타입 (박싱)
		Integer num6 = new Integer(10);
		
		System.out.println(num5.intValue() == num6.intValue());
		System.out.println(num5);
		
		num2.intValue();
	}
}
