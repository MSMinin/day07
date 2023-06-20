package set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 Set - HashSet[Set이라는 자료형이 있는데 이런건 인터페이스라고 한다.]
		 - List는 순서를 유지하지만 Set은 순서를 유지하지 않는다.
		 - 순서가 있으면 index를 이용할 수 있지만 set은 순서가 없어서 index를 사용할 수 없다. 
		 - 그래서 반복자라는 것을 사용한다.
		 - 데이터의 중복을 허용하지 않는다.
		 - 보편적으로 표현을 할때 List보다 처리속도가 빠르다.
		 - Set에 저장되어 있는 데이터는 유일성을 가지고 있다고 보면 된다.
		 - Set은 기본적으로 16개의 배열을 만든다. 그리고 add를 이용해서 데이터를 추가하면
		 - 만들어진 16개 배열안에 랜덤으로 들어간다.
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("라면");
		set.add("김밥");
		set.add("순대");
		set.add("라면");
		
		System.out.println("set : " + set);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("라면");
		
		System.out.println("arr : " + arr);
	}
}
