package map;

public class TestClass05 {
	public static void main(String[] args) {
		// 추가로, 형변환에 대한 이야기
		float f1 = (float)1.11;
		int num = 100;
		String sNum = num+"";
		// +""을 붙이면 정수에서 문자열로 형변환이 된다.
		System.out.println(sNum + 100);
		System.out.println(num + 100);
		
		int n = Integer.parseInt(sNum);
		//변환하려면 문자열이 숫자형식이여야한다. ex)100(O), "안녕"X
		System.out.println(n + 123);
	}
}
