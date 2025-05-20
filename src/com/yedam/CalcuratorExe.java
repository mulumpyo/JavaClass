package com.yedam;

import java.util.Scanner;
import com.yedam.member.*;


public class CalcuratorExe {
	public static void main(String[] args) {
		
		Calcurator calc = new Calcurator();
		Scanner scn = new Scanner(System.in);
		
		int[] numAry = { 10, 20, 30 };
		int num = 10;
		String heart = "❤";
		double sum = 0;
		double aryResult = calc.add(numAry);
		
		for(int i = 0; i < numAry.length - 1; i++) {
			if (i == 0) sum = numAry[0];
			sum = calc.add(sum, numAry[i + 1]);
		}
		
		System.out.println(sum);
		System.out.println(aryResult);

		String output = calc.printStar(num, heart);
		System.out.println(output);
		
		Member[] members = {new Member("user01", "홍길동", "1111", 1000)
				,new Member("user02", "김민규", "2222", 2200)
				,new Member("user03", "황선홍", "3333", 2700)
				,new Member("user04", "홍명보", "4444", 1900)};
		
		Member member = calc.getMaxPoint(members);
		
		member.showInfo();
		
		
		System.out.print("덧셈할 첫번째 숫자 입력 >> ");
		int num1 = Integer.parseInt(scn.nextLine());
		System.out.print("덧셈할 두번째 숫자 입력 >> ");
		int num2 = Integer.parseInt(scn.nextLine());
		
//		System.out.printf("결과값 ( %d + %d ) : %d\n" ,num1 ,num2 ,calc.add(num1, num2));
		
		double d_num1 = num1;
		double d_num2 = num2;
		System.out.printf("결과값 (double 메소드) ( %.1f + %.1f + 10.0 ) : %f.1\n" ,d_num1 ,d_num2 ,calc.add(d_num1, d_num2));
	}
}

