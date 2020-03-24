package com.collection.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Map<String, Map<Integer, List<String>>> mapObj=new HashMap<>();
		Map<Integer, List<String>> map=new HashMap<Integer, List<String>>();
		List<String> list=new ArrayList<String>();
		list.add("Chandan");
		list.add("Suma");
		list.add("Sowmya");
		map.put(100, list);
		mapObj.put("A", map);
		
		System.out.println(mapObj);
		Set<Entry<String, Map<Integer, List<String>>>> setObj=mapObj.entrySet();
		for(Entry<String, Map<Integer, List<String>>> entry1: setObj) {
			String key=entry1.getKey();
			System.out.println(key);
			Map<Integer, List<String>> map1= entry1.getValue();
			Set<Entry<Integer, List<String>>> setObj2= map1.entrySet();
			for(Entry<Integer, List<String>> entry2: setObj2) {
				Integer key2=entry2.getKey();
				System.out.println(key2);
				List<String> list2=entry2.getValue();
				for(String s: list2) {
					System.out.println(s);
				}
			}
			
		}
		
	}

}
