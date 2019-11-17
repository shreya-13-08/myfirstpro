package Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		//HashMap<Integer, String> myMap = new HashMap<Integer, String >();
		//HashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
		myMap.put(105, "apple");
		myMap.put(102, "orange");
		myMap.put(403, "banana");
		myMap.put(101, "tomato");
		System.out.println(myMap.size());
		System.out.println(myMap.get(102));
	//	myMap.remove(102);
		System.out.println(myMap.size());
		//System.out.println(myMap.get(102));
		System.out.println(myMap);
		
		//Set is used to store keys cz duplicates not allowed in Map
		Set<Integer> keys = myMap.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.print("key=" +key);
			System.out.print(" ");
			System.out.println("value=" +myMap.get(key));
			
			
		}
		

	}

}
