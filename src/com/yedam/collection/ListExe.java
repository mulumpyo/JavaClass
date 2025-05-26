package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;


import com.yedam.api.Member;
/*
 * 인덱스를 사용해서 객체를 관리
 * 순서를 가지고 중복된 값 가능
 */

class Student {
	private int sNo;
	private int score;
	
	public Student(int sNo, int score) {
		this.sNo = sNo;
		this.score = score;
	}


	public int getScore() {
		return score;
	}
}

public class ListExe {
	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		List<Student> numbers = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			Student stu1 = new Student(100 + i, ((int) (Math.random() * 91) + 10));
			numbers.add(stu1);
//			0 < x < 1
			sum += numbers.get(i).getScore();
		}
		
		avg = (double) sum / numbers.size();
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i).getScore() + " ");
		}
		System.out.println(
				);
		
		System.out.printf("합계 : %d\n평균 : %.1f"
				, sum
				, avg
		);
		
		
		
//		List<Member> members = new ArrayList<>();
//		
//		// 인터페이스         - 구현클래스
//		List<String> list = new ArrayList<String>();
//		
//		list.add("10");
//		list.add(new String("Hello"));
//		list.add(1, "20");
//		
//		list.remove(0);
//		
//		list.add(1, "World");
//		list.remove(2);
//		
//		for (String item : list) {
//			System.out.println(item);
//		}
//		
//		String search = "김홍동";
//		
//		for (int i = 0; i < members.size(); i++) {
//			
//		}
		
		
		
	}
}
