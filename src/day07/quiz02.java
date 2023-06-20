package day07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class quiz02 {
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
				} else {
					while(it.hasNext()) {
					String key = it.next();
					System.out.println(key + " : " + menu.get(key));
					}
						System.out.println("1. 수정 2. 삭제 3. 나가기");
						System.out.print(">>> ");
						int n2 = sc.nextInt();
						switch (n2) {
							case 1:
								System.out.print("수정할 메뉴의 이름을 작성해주세요. : ");
								String chName = sc.next();
								if(menu.containsKey(chName) == true) {
									System.out.print("수정할 가격을 입력해주세요. :");
									int chPr = sc.nextInt();
									menu.put(chName, chPr);
								}
								break;
							case 2: 
								System.out.print("삭제할 메뉴의 이름을 작성해주세요. : ");
								String rmName = sc.next();
								if(menu.containsKey(rmName) == true) {
									menu.remove(rmName);
								}
								break;
							case 3:
								break;
						}
				}
				
				break;
			case 3:
				System.exit(0);
				
			}
		}
	}
}
