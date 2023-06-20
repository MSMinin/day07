package day07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> menu = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println("==================");
			System.out.print(">>> ");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.print("메뉴 이름을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("입력한 메뉴의 가격을 입력해주세요 : ");
				int pr = sc.nextInt();
				menu.put(name, pr);
				System.out.println("등록되었습니다.");
				break;
			case 2:
				Iterator<String> it = menu.keySet().iterator();
				
				if(it.hasNext() == false) {
					System.out.println("저장된 메뉴가 없습니다.");
				}		
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key + " : " + menu.get(key));
				}
				break;
			case 3:
				System.exit(0);
				
			}
		}
	}
}
