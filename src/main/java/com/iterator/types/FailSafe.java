package com.iterator.types;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("Sam");
		list.add("John");
		list.add("Manuel");
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equalsIgnoreCase("John"))
				list.add("Kevin");
			if(list.get(i).equalsIgnoreCase("kevin"))
				list.remove(i);
		}
		
		System.out.println(list);
	}
}
