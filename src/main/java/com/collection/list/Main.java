package com.collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<String> llist = new LinkedList<>();
		llist.add("Sam");
		llist.add("John");
		llist.add("Peter");
		
		llist.get(2);
		llist.add(2, "Sharon");
		
		llist.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		llist.forEach(str -> System.out.println(str));
		
		Collections.sort(llist);
		System.out.println(llist);
	}
}
