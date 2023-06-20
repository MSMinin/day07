package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass04 {
	public static void main(String[] args) {
		// HashMap<String , Integer> map = new HashMap<>();
		// 위와 같이 HashMap은 순서가 랜덤이다.
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		// 하지만 LinkedHashMap을 쓰면 순서대로 값이 저장된다.
		map.put("선풍기", 100);
		map.put("자동차", 200);
		map.put("에어컨", 300);
		System.out.println(map);
		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
		// 위 2줄을 아래처럼 줄여서 작성 가능하다.
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
