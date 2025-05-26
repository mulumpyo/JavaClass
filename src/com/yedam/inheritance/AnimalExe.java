package com.yedam.inheritance;

public class AnimalExe {
	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스 생성 불가능
		// ex) Animal animal = new Animal();
		
		Animal bird = new Bird();
		System.out.println(bird.breathe());
		bird.sound();
		
		bird = new Fish();
		System.out.println(bird.breathe());
//		bird.sound();
		
	}
}
