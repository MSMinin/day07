package string;

import java.util.Random;

public class TestClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("================");
		
		for(int i = 0; i < 5; i++) {
			double ran = Math.random() * 3;
			// 0.0000 ~ 0.9999
			// *3을 한다면
			// 0.0000 ~ 2.9999
			//(int)를 붙여 형변환을 하면 0 ~ 2사이의 랜덤한 정수값이 나온다.
			System.out.println((int)ran);
		}
		
		System.out.println("================");
		
		Random r = new Random();
		for(int i = 0; i < 5; i++) {
			int num = r.nextInt(45); // 0 ~ 44
			System.out.println(num + 1); // 1 ~ 45 랜덤 출력
		}
	}
}
