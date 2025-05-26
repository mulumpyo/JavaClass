package com.yedam.board;

class User {
	private String usrId;
	private String usrPw;
	private String usrName;
	
	User(String usrId, String usrPw, String usrName) {
		this.usrId = usrId;
		this.usrPw = usrPw;
		this.usrName = usrName;
	}

	public String getUsrId() {
		return usrId;
	}

	public String getUsrPw() {
		return usrPw;
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	
}



public class UserExe {
	static User[] users = {
			new User("holy", "1111", "김영광")
			, new User("1119_dh", "1119", "김대환")
			, new User("sdsad", "2222", "김형석")

	};
	
	static boolean login(String usrId, String usrPw) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].getUsrId().equals(usrId) && users[i].getUsrPw().equals(usrPw) ) {
				return true;
			}
		}
		
		return false;
	}
	
}

