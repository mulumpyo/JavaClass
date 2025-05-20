package com.yedam.board;

public class Board {
	
	private int boardNo; // 글번호
	private String title; // 글 제목
	private String content; // 글 내용
	private String writer; // 글 작성자
	
	// 생성자
	public Board() {
		
	}
	
	public Board(int boardNo, String title, String content, String writer) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void showInfo() {
		System.out.printf("%3d %20s %6s\n" ,boardNo ,title ,writer);
	}
	
	public void showAllInfo() {
		String strFormat = "\n글번호 : %d    작성자 : %s\n";
		strFormat += "제목: %s\n";
		strFormat += "======== 내용 ========\n%s\n\n";
		System.out.printf(strFormat, boardNo, writer, title, content);
	}
}
