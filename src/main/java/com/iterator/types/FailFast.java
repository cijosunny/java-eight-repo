package com.iterator.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFast {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sam");
		list.add("John");
		list.add("Manuel");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			if(itr.next().equals("Sam")){
				itr.remove();
			}
		}
		
		list = new ArrayList<>();
		list.add("Sam");
		list.add("John");
		list.add("Manuel");
		
		ListIterator<String> listItr = list.listIterator(0);
		while(listItr.hasNext()){
			String obj = listItr.next();
			if(obj.equalsIgnoreCase("john"))
			listItr.remove();
			if(obj.equalsIgnoreCase("manuel"))
			listItr.set("Man");
		}
		System.out.println(list);
		
//		list = new ArrayList<>();
//		list.add("Sam");
//		list.add("John");
//		list.add("Manuel");
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			list.remove("Sam");
//		}
//		System.out.println(list);
	}

}
