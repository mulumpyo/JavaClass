package com.yedam.api;

/**
 * 
 */
public class Member {
	String memberName;
	int age;
	
	
	public Member() {
		
	}
	
	// 생성자
	public Member(String memberName, int age) {
		super();
		this.memberName = memberName;
		this.age = age;
	}
	
	
	public int hashCode() {
		return age;
	}
	
	
	// 이름, 나이 => 같으면 동등한지 반환
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return this.memberName == member.memberName
					&& this.age == member.age;
		}
		return false;
	}
	
	
	
}
