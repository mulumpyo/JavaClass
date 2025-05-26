package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class ObjectExe {
	public static void main(String[] args) {
		int[] ary = new int[5];
		
		for (int num : ary) {
			System.out.println(num);
		}
		
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		for (Integer num : set) {
			System.out.println(num);
		}
		
		
	}
}


