package string;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("문자열 입력 : ");
		String str2 = "    test    ";//new Scanner(System.in).next();
		
		System.out.println(str +".");
		System.out.println(str2 +".");
		System.out.println(str2.trim()+".");
		//trim() : 문자열 양쪽에 있는 공백을 지워준다.
		
		System.out.println("str == str2 : " + str.equals(str2));
		// 공백때문에 false가 나옴
		System.out.println("str == str2 : " + str.equals(str2.trim()));
		// trim()으로 공백을 없애서 true가 나온다.
		
		System.out.println(""); //--------------------------------------
		
		String addr = "052154/서울 종로구/단성사 4층";
		//어디까지가 우편번호이고, 상세주소인지 구분하기 위해서
		// split()이라는 기능을 사용한다.
		String[] s_addr =  addr.split("/"); // 이러면 /를 기준으로 나눈다는 뜻이다.
		// 위와 같이 split()을 사용하면 배열로 저장해주어야한다.
		for(int i = 0; i < s_addr.length; i++) {
			System.out.println(s_addr[i]);
		}
		
		System.out.println(""); //--------------------------------------
		
		String result = addr.replace("/", "."); 
		//replace()를 이용해서 /를 모두 .으로 변경한다. /말고도 다른값을 .말고 다른값으로 변경 가능하다.
		System.out.println(addr);
		System.out.println(result);
	}
}
