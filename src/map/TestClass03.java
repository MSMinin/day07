package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "산골짜기");
		System.out.println("map : " + map);
		
		System.out.println(map.keySet());
		// key 값만 꺼내온다.
		System.out.println(map.values());
		// value 값만 꺼내온다.
		
		Set<String> set =  map.keySet();
		// keySet으로 나오는 값을 저장하려면 Set자료형으로 저장해야한다고 하셨다.
		System.out.println("set : " + set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
