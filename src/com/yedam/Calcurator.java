package com.yedam;

import com.yedam.member.*;

public class Calcurator {
	
	String printStar(int times, String shape) {
		String str = "";
		while(times > 0) {
			str += shape + "\n";
			times--;
		}
		return str;
	}
	
	
	// 이름이 같아도 반환 데이터 타입, 매개변수 갯수의 차이가 있을 경우 생성 가능 ( 메소드 오버로딩 )
//	int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	double add(int num1, int num2) {
		return num1 + num2 + 20;
	}
	
	double add(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	Member getMaxPoint(Member[] members) {
		Member max = null;
		int maxPoint = 0;
		
		for (int i = 0; i < members.length; i++) {
			if (maxPoint < members[i].getPoint()) {
				maxPoint = members[i].getPoint();
				max = members[i];
			}
		}
		return max;
	}
	
}
