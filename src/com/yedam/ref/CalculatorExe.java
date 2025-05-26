package com.yedam.ref;

public class CalculatorExe {
	public static void main(String[] args) {
		int a = 20, b = 30;
		
		Calculator.sum(a, b);
		
//		CalculatorExe ce = new CalculatorExe();
//		ce.printStar();
		
	}
	
	void printStar() {
		output("*");
	}

	void output(String msg) {
		System.out.print(msg);
	}
}
