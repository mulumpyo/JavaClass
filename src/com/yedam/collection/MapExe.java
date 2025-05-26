package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Set;

/*
 * Map 컬렉션 {키 : 값 }
 */

// 학생 ( 이름, 정수 )

class Student2 {
	private String studentName;
	private int score;
	
	// 생성자
	public Student2(String studentName, int score) {
		super();
		this.studentName = studentName;
		this.score = score;
	}
	
	// hashCode, equals. => 이름, 점수 같으면 동등객체
	@Override
	public int hashCode() {
		return score;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 std = (Student2) obj;
			return this.studentName.equals(std.getStudentName())
					&& this.score == std.score;
		}
		return false;
	}
	
	
	
	public String getStudentName() {
		return studentName;
	}

	public int getScore() {
		return score;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class MapExe {
	public static void main(String[] args) {
		
		// 학생, 반
		Map<Student2, String> map;
		map = new HashMap<Student2, String>();
		
		map.put(new Student2("홍길동", 70), "1반");
		map.put(new Student2("김민규", 80), "2반");
		map.put(new Student2("박철승", 75), "1반");
		map.put(new Student2("최성철", 85), "2반");
		
		Scanner scn = new Scanner(System.in);
		String keyword = scn.nextLine();
		int score = Integer.parseInt(scn.nextLine());
		
//		System.out.println(new Student2(keyword, score) == new Student2(keyword, score));
		
		
		if (map.containsKey(new Student2(keyword, score))) {
			System.out.println("반: " + map.get(new Student2(keyword, score)));
		}
		
//		Set<Student2> set = map.keySet();
//	
//		Iterator<Student2> iter = set.iterator();
//		while(iter.hasNext()) {
//			Student2 std = iter.next(); // 획득
//			if (std.getStudentName().equals(keyword)) {
//				System.out.println("점수: " + std.getScore());
//				String cls = map.get(std);
//				System.out.printf("이름: %s 점수 : %d 반: %s\n"
//						, std.getStudentName()
//						, std.getScore()
//						, cls
//				);
//			}
//		}
	}
	
	public static void exe2() {
		// Map< String, String >
		Map<String, String> map;
		map = new HashMap<>();
		
		map.put("user01", "1111");
		map.put("user02", "2222");
		map.put("user03", "3333");
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요 >> ");
			String id = scn.nextLine();
			System.out.print("비밀번호를 입력하세요 >> ");
			String pw = scn.nextLine();
			
			if (map.containsKey(id)) {
				// 키가 존재 => 비밀번호 체크
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("아이디를 다시 확인하세요.");
			}
		}
		

		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(map);
		System.out.println(json);
	}
	
	public static void exe() {
		
		Map<String, Integer> map = new HashMap<>();
		
		
		// 추가
		map.put("홍길동", 80);
		map.put("김민수", 70);
		map.put("홍길동", 85);
		map.put("박철민", 90);
		
		
		// 자바객체( map ) -> JSON 문자열 출력 [ Gson 라이브러리 활용 ]
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(map);
		System.out.println(json);
		
		//삭제
		map.remove("홍길동");
		System.out.println(map);
		
		
		// 조회 ( 키 => 값 )
		Integer score = map.get("김민수");
		score = map.get("홍길동");
		System.out.println(score);
		
		
		// 반복
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		// 반복자
		Iterator<String> iter = keyset.iterator();
		System.out.println(iter);
		
		while(iter.hasNext()) {
			String key = iter.next(); // 반복요소 획득
			Integer value = map.get(key);
			System.out.printf("키: %s, 값: %d\n", key, value);
		}
		
		
		// { 키 : 값 } 반환 Map.Entry 타입
		Set<Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = entryset.iterator();
		while(iter2.hasNext()) {
			Entry<String, Integer> entry = iter2.next();
			System.out.printf("키: %s, 값: %d\n", entry.getKey(), entry.getValue());
		}
		
	}
}
