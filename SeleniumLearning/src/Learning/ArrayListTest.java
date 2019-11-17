package Learning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("java");
		subjects.add("jmeter");
		subjects.add("manual");
		System.out.println(subjects);
		//System.out.println(subjects.size());
		//subjects.remove(2);
		System.out.println(subjects.size());
		subjects.set(2, "selenium");
		System.out.println(subjects);
		subjects.add("selenium");
		subjects.add(null);
		for (Iterator iterator = subjects.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(subjects);
			
		}
	}

}
