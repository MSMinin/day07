package map;

import java.util.HashMap;

public class TestClass02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : " + map);
		
		int num = map.get("age");
		System.out.println("num : " + num);
		System.out.println("map.get(num) : " + map.get("num"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(10000));
		
		map.put("age", 100);
		System.out.println("map : " + map);
		// key 중복은 안되지만 value는 변경이 되었다.
		
		map.remove("age");
		// key를 넣으면 value도 같이 삭제된다.
		System.out.println("remove 결과 : " + map);
	}
}
