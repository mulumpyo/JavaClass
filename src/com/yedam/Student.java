package com.yedam;

/*
 * 라이브러리 클래스.
 */

public class Student {
	
	// 학생의 필드 정보( 속성 ) ---------------------------------------------------------------
	private int studentNo;
	private String studentName;
	private double height;
	private int engScore;
	private int mathScore;
	// -----------------------------------------------------------------------------------
	
	
	// 생성자 ( 객체 : instance의 초기화 ) ---------------------------------------------------
	

	public Student() {
	
	}
	
	public Student(int studentNo, String studentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
	
	public Student(int studentNo, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	// 메소드( 기능 ) -----------------------------------------------------------------------
	void study() {
		System.out.println("공부 중.....");
	}
	
	void introduce() {
		System.out.printf("학번 : %d\n이름 : %s\n", studentNo, studentName);
	}
	
	/* void study(), void introduce() => static이 없는 이유 실행 클래스가 아닌 
	 * 라이브러리 클래스에 인스턴스가 포함한 하나의 기능이기 때문 (static이 붙으면 메모리 할당)
	 */
	
	// ------------------------------------------------------------------------------------
	
	
	// 영어, 수학 점수 저장
	void setEngScore(int engScore) {
		if (engScore < 0 || engScore > 100) {
			return;
		}
		this.engScore = engScore;
	}
	
	void setMathScore(int mathScore) {
		if (mathScore < 0 || mathScore > 100) {
			return;
		}
		this.mathScore = mathScore;
	}
	// ----------------------------------------------------------------------------------
	void setStudentNo(int studentNo) {
		if (studentNo < 0 || studentNo > 10000) {
			return;
		}
		this.studentNo = studentNo;
	}
	
	void setStudentName(String studentName) {
		if (studentName.length() > 5 || studentName.length() == 0) {
			return;
		}
		this.studentName = studentName;
	}
	
	
	int getStudentNo() {
		return this.studentNo;
	}
	
	String getStudentName() {
		return this.studentName;
	}
	
	int getEngScore() {
		return this.engScore;
	}
	
	int getMathScore() {
		return this.mathScore;
	}
	
	
}
