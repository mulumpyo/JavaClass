package com.yedam;
/*
 * 실행 클래스.
 */
public class StudentExample {
	public static void main(String[] args) {
		
		// 인스턴스(객체) 생성
		// 클래스  변수       인스턴스 생성   =>  인스턴트를 생성하여 변수 student에 저장
		Student student = new Student();
		
		// student 인스턴스에는 아래의 값들이 저장 ( 1001, 홍길동 )
		student.setStudentNo(1001);
		student.setStudentName("홍길동");
		student.setEngScore(80);
		student.setMathScore(85);
		
		student.study();
		
		System.out.printf("이름 : %s\n영어점수 : %d\n수학점수 : %d\n\n" ,student.getStudentName() ,student.getEngScore(), student.getMathScore());
		
		System.out.println();
		
		Student student2 = new Student(1002, "김민규");
		
		// student2 인스턴스에는 아래의 값들이 저장 ( 1002, 김민규 )
//		student2.studentNo = 1002;
//		student2.studentName = "김민규";
		student2.setEngScore(-50);
		student2.setMathScore(-80);
		student2.study();
		student2.introduce();
//		student2.studentName = "박민규";
		
	}
}
