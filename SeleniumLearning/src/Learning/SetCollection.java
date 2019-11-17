package Learning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		//HashSet<String> subjects = new HashSet<String>();
		//HashSet<String> subjects = new LinkedHashSet<String>();
		TreeSet<String> subjects = new TreeSet<String>();
		subjects.add("java");
		subjects.add("jmeter");
		subjects.add("manual");
		//System.out.println(subjects);
		//System.out.println(subjects.size());
		//subjects.remove(2);
		System.out.println(subjects.size());
		//subjects.set(2, "selenium");
		
		subjects.add("selenium");
		//subjects.add(null);   treeSet wont allow null cz its a sorted collection
		System.out.println(subjects);

	}

}
