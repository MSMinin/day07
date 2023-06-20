package string;

public class TestClass01 {
	public static void main(String[] args) {
		String str;
		String str2 = new String();
		
		String str3 = "test";
		String str4 = new String("Java Programming");
		// String은 위와 같이 초기화가 가능하다.
		
		String s1 = str4.toUpperCase(); // 내용물을 대문자로 변환
		System.out.println(s1);
		String s2 = str4.toLowerCase(); // 내용물을 소문자로 변환
		System.out.println(s2);
		System.out.println(str4); // 원래 str4에는 영향 X
		
		str3 = "Java";
		if(str3.toLowerCase().equals("java")){
			System.out.println("수강 과목은 자바");
		}
	}
}
