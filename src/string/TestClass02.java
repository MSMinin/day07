package string;

public class TestClass02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println(str);
		
		char ch = str.charAt(1);
		System.out.println(str.charAt(0)); 
		// charAt(index) : 문자열에 대한 index를 보고 해당하는 문자를 가져온다.
		System.out.println(ch);
		
		System.out.println(ch == 'e');
		// 문자 하나는 ==, 문자열은 .equals()를 사용한다.
	}
}
