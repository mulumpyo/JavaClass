package com.yedam.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueExe {
	public static void main(String[] args) {
		
		
		// FIFO.
		Queue<String> orders = new LinkedList<String>();
		
		orders.offer("까페라떼");
		orders.offer("아메리카노");
		orders.offer("녹차");
		
		while (!orders.isEmpty()) {
			System.out.println(orders.poll());
		}
		
		
		// LIFO
		Stack<String> books = new Stack<String>();
		books.push("이게 자바?");
		books.push("뭔가 잘 못 됐다.");
		books.push("열심히 당근 흔드는 중");
		
		while (!books.isEmpty()) {
			System.out.println(books.pop());
		}
	}
}


