package chapter11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Word {
	static Scanner scan = new Scanner(System.in);
	static TreeMap<String, String> map = new TreeMap<>();

	public static void main(String[] args) {

		boolean run = true;

		while (run) {

			System.out.println("메뉴 선택");
			System.out.println("[1. 단어 등록] / [2. 단어 수정] / [3. 단어 조회 및 삭제] / [4. 전체 조회]");
			int num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("단어 등록");
				regWord();
				break;
			case 2:
				System.out.println("단어 수정");
				editWord();
				break;
			case 3:
				System.out.println("단어 조회 및 수정");
				System.out.println("단어 조회를 하려면 1번을 단어를 삭제하려면 2번을 눌러주세요");
				int n = scan.nextInt();
				if (n == 1) {
					chkWord();
				} else if (n == 2) {
					chkDelete();
				} else {
					System.out.println("잘못된 입력입니다.");
					return;
				}
				break;
			case 4:
				System.out.println("단어 전체 조회");
				chkAll();
			}
		}

	}

	static void regWord() {
		System.out.println("등록 할 단어를 입력하세요");
		String a = scan.next();
		System.out.println("등록 할 단어의 뜻을 입력하세요");
		String b = scan.next();

		map.put(a, b);
		System.out.println("단어가 저장되었습니다.");
		System.out.println("단어 : " + a + "  뜻 : " + b);

	}

	static void chkAll() {
		System.out.println("등록된 단어들 입니다.");
		Set<String> keySet = map.keySet();
		Iterator<String> keyItr = keySet.iterator();
		while (keyItr.hasNext()) {
			String key = keyItr.next();
			String value = map.get(key);
			System.out.println("단어 : " + key + "  뜻 : " + value);
			System.out.println();
		}
	}

	static void editWord() {
		System.out.println("수정 할 단어를 입력하세요");
		String a = scan.next();
		System.out.println("수정 할 단어의 뜻을 입력하세요");
		String b = scan.next();

		map.put(a, b);
		System.out.println("단어가 저장되었습니다.");
		System.out.println("단어 : " + a + "  뜻 : " + b);

	}

	static void chkWord() {
		System.out.println("조회할 단어를 입력하세요.");
		String a = scan.next();
		map.get(a);
		System.out.println("단어 : " + map.floorEntry(a).getKey() + "  뜻 : " + map.floorEntry(a).getValue());
	}

	static void chkDelete() {
		System.out.println("삭제할 단어를 입력하세요.");
		String a = scan.next();
		map.remove(a);
		System.out.println("삭제되었습니다.");
	}

}
