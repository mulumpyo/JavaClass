package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("월요일");
		set.add("금요일");
		
		if(set.contains("월요일")) {
			System.out.println(set.remove("월요일"));			
		}
		
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		
		
	}
	
}




