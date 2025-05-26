package com.yedam.inheritance;

public class SmartPhone extends CellPhone {
	int channel;
	
	void fold() {
		System.out.println("폰을 접습니다.");
	}
	
	@Override
	void powerOn() {
		System.out.println(model + "을 열고 전원을 활성화.");
	}
	
	void watch() {
		System.out.println(channel + " 보지마");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
