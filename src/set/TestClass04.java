package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("일"); set.add("이"); set.add("삼");
		System.out.println("set : " + set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { 
			// 마지막 값으로 이동하면 다음엔 값이 없어서 false가 되므로 반복에서 빠져나온다.
			String s = it.next();
			System.out.println(s);
		}
		
		
	}
}
