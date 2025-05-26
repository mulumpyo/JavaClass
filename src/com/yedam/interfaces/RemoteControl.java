package com.yedam.interfaces;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	
	public void turnOn();
}

// interface 내부에선 필드가 자동으로 상수(final)
// 메소드는 자동으로 추상메소드.

		
		