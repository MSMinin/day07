package set;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		 Iterator - 반복자
		 - 컬렉션 프레임워크들을 순서있는 배열형식으로 변환해준다.
		 */
		ArrayList<String> arr = new ArrayList<>();
		arr.add("일"); arr.add("이"); arr.add("삼");
		System.out.println("arr : " + arr);
		
		Iterator<String> it = arr.iterator();
		// arr을 배열형식으로 변환한다.
		/*
		 반복자의 기능 ▼
		 hasNext : 다음 위치의 값이 있으면 true, 없으면 false
		 next : 다음 위치로 이동하며 해당 위치의 값을 얻어오는 기능
		 */
		// 변환했을때 맨앞과 맨뒤에 배열공간을 만들고 그 가운데 배열에 변환한 변수를 넣는다.
		// 맨앞은 bof, 맨뒤는 eof라고 한다.
		System.out.println(it.hasNext());
		System.out.println(it.next());
		// 맨처음에는 bof이므로 next를 사용하면 "일"이 출력된다.
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
	}
}
