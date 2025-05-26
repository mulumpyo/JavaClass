package com.yedam.inheritance;

// 자식클래스: Bird, Fish

public abstract class Animal {
	
	String kind;
	
	public String breathe() {
		return "숨을 쉽니다.";
	}

	// 추상메소드: 자식클래스에서 *반드시 재정의* 필요.
	public abstract void sound();
	
}
