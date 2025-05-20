package com.yedam.board;

import java.util.Scanner;

public class BoardExe {
	private Board[] boards;
	private Scanner scn = new Scanner(System.in);

	
	public BoardExe() {
		
		boards = new Board[100];
	}
	
	void execute() {
		
		boolean run = true;
		String str = "---------------------------------------\n(1) 추가\n(2) 수정\n(3) 삭제\n(4) 목록\n(5) 종료\n---------------------------------------\n선택 >> "; 
		String defaultMSG = "1 ~ 5 사이의 숫자를 입력하세요.";
		String endMSG = "종료";
		
		while (run) {
			System.out.print(str);
			int selNo = Integer.parseInt(scn.nextLine());
			switch (selNo) {
			case 1:
				addBoard();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				boardList();
				break;
			case 5:
				scn.close();
				run = false;
				System.out.println(endMSG);
				break;
			default:
				System.out.println(defaultMSG);
				break;
			}
		}
	}
	
	void addBoard() {
		
		System.out.print("글번호를 입력하세요 >> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("제목을 입력하세요 >> ");
		String title = scn.nextLine();
		System.out.print("내용을 입력하세요 >> ");
		String content = scn.nextLine();
		System.out.print("작성자를 입력하세요 >> ");
		String writer = scn.nextLine();
		
		Board board = new Board(no ,title ,content ,writer);
		
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
		
		System.out.println("추가 성공");
	}
	
	void boardList() {
		
		String nothing = "작성된 글이 없습니다.";
		String str = "=============================\n글번호             제목          이름\n=============================\n";
		String msg = "-----------------------------\n상세보기 글 번호 입력\n(q를 누르면 메뉴로 이동합니다.) >> ";
		String content = "";
		
		System.out.println(str);
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				boards[i].showInfo();
			}
		}
		System.out.print(msg);
		String input = scn.nextLine();
		
		if (input.equals("q")) {
			return;
		}
		int inputNum = Integer.parseInt(input);
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == inputNum) {
				boards[i].showAllInfo();
				break;
			}
		}
	}
	
}
