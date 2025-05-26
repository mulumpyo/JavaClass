package com.yedam.inheritance;

// 부모클래스: Animal (추상)

public class Bird extends Animal {
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
