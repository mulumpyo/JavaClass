package com.yedam.io;

public class Student1 {

	private int studentNo;
	private int score;
	
	Student1(int studentNo, int score) {
		super();
		this.studentNo = studentNo;
		this.score = score;
	}
	
	
	public int getStudentNo() {
		return studentNo;
	}

	public int getScore() {
		return score;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
