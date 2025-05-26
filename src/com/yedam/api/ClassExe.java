package com.yedam.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExe {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.yedam.api.Member");
			
			Member member = new Member();
			cls = member.getClass();
			
			
			System.out.println(cls.getName());
			Field[] fieldAry = cls.getDeclaredFields();
			for (Field field : fieldAry) {
				System.out.println("필드명 : " + field.getName());
			}
			Method[] methodAry = cls.getDeclaredMethods();
			for (Method method : methodAry) {
				System.out.println("메소드명 : " + method.getName());
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}