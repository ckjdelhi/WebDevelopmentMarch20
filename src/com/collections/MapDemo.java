package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(100, "Chandan");
		map.put(101, "Suma");
		map.put(99, "Sowmya");
		map.put(98, "Vineeth");
		
		//To print all keys
		Set<Integer> keys= map.keySet();
		System.out.println(keys);
		
		//To print all values
		Collection<String> values=map.values();
		System.out.println(values);
		
		//To print all keys and Values together
		Set<Entry<Integer, String>> entrySet=map.entrySet();
		System.out.println(entrySet);
		
		for(Entry<Integer, String> entryObj: entrySet) {
			System.out.println(entryObj.getKey() +"\t"+entryObj.getValue());
		}
				
		for(Integer k: map.keySet()) {
			System.out.println(k +"\t"+map.get(k));
		}
		
		Iterator<Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry= itr.next();
			System.out.println(entry.getKey() +"\t"+entry.getValue());
		}
		
	}

}
