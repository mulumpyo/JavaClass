package com.yedam.board;

import java.util.Scanner;

/*
 * 
 * 게시글 추가 addboard();
 * 게시글 수정 modifyBoard();
 * 게시글 삭제 removeBoard();
 * 게시글 목록 boardList();
 * 게시글 단건 조회 getBoard(); 
 * 게시글 번호 자동 부여 nextSeq();
 * 게시글 정렬 sort();
 */

public class BoardExe {
	
	private Board[] boards;
	private Scanner scn = new Scanner(System.in);

	
	public BoardExe() {
		
		boards = new Board[100];
		
		for (int i = 0; i < boards.length; i++) {
			String author = "";
			String title = i + "번째 게시글의 제목"; 
			String content = "내용은 중요하지 않아 * " + i;
			if (i % 2 == 0) {
				author = "대환";
			} else {
				author = "감자";
			}
			boards[i] = new Board(i, title, content, author);
		}
	}
	
	void execute() {
		if(!loginCheck()) {
			return;
		}
		
		String str = "---------------------------------------\n(1) 추가\n(2) 수정\n(3) 삭제\n(4) 목록\n(5) 종료\n---------------------------------------\n선택 >> "; 
		String defaultMSG = "1 ~ 5 사이의 숫자를 입력하세요.\n";
		String endMSG = "종료\n";
		
		boolean run = true;
		
		while (run) {
				
			int selNo = userMenu(str);
			switch (selNo) {
			case 1:
				addBoard();
				break;
			case 2:
				modifyBoard();
				break;
			case 3:
				removeBoard();
				break;
			case 4:
				boardList();
				break;
			case 5:
				scn.close();
				run = false;
				output(endMSG);
				break;
			default:
				output(defaultMSG);
				break;
			}
		}	
		
	}
	
	void addBoard() {
		
		// 데이터 입력받는 부분
		int no = nextSeq();
				// Integer.parseInt(userMessage("글번호를 입력하세요 >> "));
		String title = userMessage("제목을 입력하세요 >> ");
		String content = userMessage("내용을 입력하세요 >> ");
		String writer = userMessage("작성자를 입력하세요 >> ");
		
		// 작성받은 데이터를 이용하여 새로운 객체 생성
		Board board = new Board(no ,title ,content ,writer);
		
		// 새로 생성한 객체를 boards 배열을 순회하여 null값이 있을 경우 덮어쓰기
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
		
		output("추가 성공\n");
	}
	
	void boardList() {
		
		String nothing = "작성된 글이 없습니다.";
		String str = "=======================================\n글번호             제목          이름\n=======================================\n";
		String msg = "---------------------------------------\n상세보기 글 번호 입력\n(q를 누르면 메뉴로 이동합니다.) >> ";
		String content = "";
		String input = "";
		
		int page = 1;
		int all = 0; // 전체 게시글 수
		
		System.out.println(str);
		
		sort();
		
		// boards 배열을 모두 순회하여 showInfo() 함수 실행

		for (int i = 0; i < boards.length; i++) {
				all++;
		}
		output("총 게시글의 수 " + all + "\n");
		
		
		listUpdate(page);
		
		boolean run = true;
		while(run) {
			input = userMessage(msg);
			switch (input) {
			case "q":
				run = false;
				break;	
			case "n":
				page++;
				listUpdate(page);
				break;
			case "p":
				if (page != 1) {
					page--;
					listUpdate(page);
				} else {
					output("이미 첫번째 페이지입니다.\n");
				}
				break;
			default:
				int inputNum = Integer.parseInt(input);
				output(getBoard(inputNum).showAllInfo());
				
			}
		}

		
		// 사용자가 "q"를 입력할 경우 이전 선택화면으로 return

		
		// 사용자로부터 입력받은 값(글번호)을 가지고 게시글 단건조회

	}
	
	void removeBoard() {
		int bno = userMenu("삭제하고자 하는 게시글의 번호를 입력하세요. >> ");
		if (getBoard(bno) == null) {
			output("이미 삭제되었거나 존재하지 않는 게시글입니다.\n");
			return;
		}
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == bno) {
				boards[i] = null;
				output("삭제 완료\n");
			}
		}
	}
	
	void modifyBoard() {
		int bno = userMenu("수정하고자 하는 게시글의 번호를 입력하세요. >> ");
		Board result = getBoard(bno);
		
		if (result == null) {
			output("수정하고자 하는 게시글을 찾을 수 없습니다.\n");
			return;
		}
		
		String title = userMessage("수정할 제목을 입력하세요 >> ");
		String content = userMessage("수정할 내용을 입력하세요 >> ");
		
		result.setTitle(title);
		result.setContent(content);

		output("수정 완료\n");
	}
	
	// 키값(글번호)을 가지고 게시글의 내용 조회 (단건조회)
	Board getBoard(int boardNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				return boards[i];
			}
		}
		return null;
	}
	
	int nextSeq() {
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && max < boards[i].getBoardNo())
				max = boards[i].getBoardNo();
		}
		return max + 1;
	}
	
	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				}
				if (boards[i].getBoardNo() < boards[i + 1].getBoardNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	}
	
	boolean loginCheck() {
		int loginCnt = 0;
		
		while (true) {
			String usrId = userMessage("아이디를 입력하세요 : >> ");
			String usrPw = userMessage("비밀번호를 입력하세요 : >> ");
			
			if (!UserExe.login(usrId, usrPw)) {
				if (loginCnt < 2) {
					output("아이디와 비밀번호를 다시 확인하세요.\n");
					loginCnt++;
				} else {
					output("로그인 실패 : 3회 초과\n");
					return false;
				}
			} else {
				output("로그인 성공\n");
				return true;
			}
		}
	}
	
	String userMessage(String msg) {
		System.out.print(msg);
		return scn.nextLine();
	}
	
	int userMenu(String msg) {
		System.out.print(msg);
		try {
			return Integer.parseInt(scn.nextLine());
		} catch (NumberFormatException e) {
			return 0;
		}

	}
	
	void output(String msg) {
		System.out.print(msg);
	}
	
	void listUpdate(int page) {
		for (int i = (page - 1) * 10; i < ((page - 1) * 10 + 10); i++) {
			if (boards[i] != null) {
				boards[i].showInfo();
			}
		}
	}
	
}
