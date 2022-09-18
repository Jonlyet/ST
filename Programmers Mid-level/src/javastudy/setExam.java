package javastudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
	public static void main(String[] args) {
		
		Set<String > set1 = new HashSet<>();
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		System.out.println(set1.size()); //2 return 
		
		System.out.println(flag1); // true
		System.out.println(flag2); // true 
		System.out.println(flag3); // false 
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str); // kang, kim return 
		}
	}
}
