package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateCollection {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer>();
		obj.add(200);
		obj.add(100);
		obj.add(200);
		obj.add(400);
		System.out.println(obj);//[200, 100, 200, 400]
		
		//While, Do-While, For, For-each loop, Iterator, java8-way,
		/*int i=0;
		while(i<obj.size()) {
			System.out.println(obj.get(i));
			i++;
		}*/
		/*for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}*/
		/*for(Integer o: obj) {
			System.out.println(o);
		}*/
		/*ListIterator<Integer> itr=obj.listIterator();
		while(itr.hasPrevious()) {
			System.out.println(itr.next());
		}*/
		
		obj.forEach(abc -> System.out.println(abc));
		
	}

}
