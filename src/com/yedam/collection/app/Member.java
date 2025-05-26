package com.yedam.collection.app;

public class Member {
	
	//필드
	private String memberId;
	private String memberName;
	private String phone;
	private int point;
	
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public void showInfo() {
		System.out.printf("최다 포인트 : %s %s %s %d\n" ,this.memberId ,this.memberName ,this.phone ,this.point);
	}
	
	
	public String getMemberId() {
		return memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getPhone() {
		return phone;
	}
	public int getPoint() {
		return point;
	}
	

	public Member(String memberId, String memberName, String phone, int point) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}
}
