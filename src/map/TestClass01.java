package map;

import java.util.HashMap;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 Map - HashMap
		 - key와 value형식으로 만들어진다.
		 - key의 중복은 허용되지 않으면, value의 중복은 가능하다.
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		System.out.println("map : " + map);
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("없는 값"));
		// get에서 key를 넣으면 그 key가 가진 value를 가져온다.
	}
}
