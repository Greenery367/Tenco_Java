package basic.exercise;

import java.util.Scanner;

public class PhonBookManager {
	static int LAST_INDEX_NUMBER;

	public static void main(String[] args) {
		// 함수의 시작

		// 스캐너 사용
		// 배열 선언 100개
		// while

		// 1. 사용자에게 선택지를 보여준다.
		// 2. 스캐너로 사용자의 선택을 받는다.
		// 3. 사용자의 선택에 따라, 만약 --라면~
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		final String SAVE = "1";
		final String SEARCH_All = "2";
		final String UPDATE = "3";
		final String DELETE = "4";
		final String CHOICE_SEARCH = "5";
		final String END = "0";

		PhoneBook[] newbook1 = new PhoneBook[100];
		newbook1[1] = new PhoneBook("엄송현", "010-8885-4878");
		newbook1[2] = new PhoneBook("지나가는 사람", "010-xxxx-aaaa");

		while (flag) {
			System.out.println(">>>>>My Phone Book<<<<<");
			System.out.println("메뉴를 선택하시오.");
			System.out.println("1. 저장하기 | 2. 전체 조회하기 | 3. 수정하기 | 4. 삭제하기 | 5. 선택 조회하기 | 0. 종료하기");
			String choice = sc.nextLine();

			// 1. 저장하기
			if (choice.equals(SAVE)) {
				SavePhoneBook(sc, newbook1);
			}
			// 2. 조회하기
			else if (choice.equals(SEARCH_All)) {
				SearchPhoneBook_ByName(sc, newbook1);
			}
			// 3. 수정하기
			else if (choice.equals(UPDATE)) {
				UpdatePhoneNumber(sc, newbook1);
			}
			// 4. 삭제하기
			else if (choice.equals(DELETE)) {
				DeleteNumber(sc, newbook1);

			}
			// 5. 선택 조회하기
			else if (choice.equals(CHOICE_SEARCH)) {
				ChoiceAndSearch(sc, newbook1);

			}
			// 0. 종료하기
			else if (choice.equals(END)) {
				END();
				flag = false;

			}
			// 다른 값을 입력했을 때
			else {
				System.out.println("잘못된 값입니다. 다시 입력하세요.");
			}
		}

	} // end of main

	// 1. 저장하기
	public static void SavePhoneBook(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("저장을 시작합니다.");
		System.out.println(" 사용자의 이름을 입력하시오. :");
		String phoneName = sc.nextLine();
		System.out.println(" 사용자의 전화번호를 입력하시오. :");
		String phoneNumber = sc.nextLine();
		PhoneBook phonebook1 = new PhoneBook(phoneName, phoneNumber);

		if (LAST_INDEX_NUMBER >= phonebook.length) {
			System.out.println("저장이 불가능합니다.");
			return;
		}

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] == null) {
				phonebook[i] = phonebook1;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
	}

	// 2. 조회하기
	public static void SearchPhoneBook_ByName(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("전체 조회를 시작합니다.");
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				phonebook[i].showInfo();
			}
		}

	}

	// 3. 수정하기
	public static void UpdatePhoneNumber(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("기존 정보 수정을 시작합니다.");
		System.out.println("바꾸고자 하는 사용자의 이름을 입력하시오");
		String userName = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(userName)) {
					System.out.println("수정할 이름을 입력하시오.");
					String newName = sc.nextLine();
					System.out.println("수정할 번호를 입력하시오.");
					String newNumber = sc.nextLine();
					phonebook[i].setName(newName);
					phonebook[i].setNumber(newNumber);
					System.out.println("정보가 성공적으로 수정되었습니다.");
					break;
				} else {
					System.out.println("수정하고자 하는 회원의 정보가 없습니다.");
					System.out.println("다시 한 번 입력해주세요.");
					break;
				}
			}
		}
	}

	// 4. 삭제하기
	public static void DeleteNumber(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("기존 정보를 삭제합니다.");
		System.out.println("삭제하고자 하는 사용자의 이름을 입력하시오");
		String deleteNumber = sc.nextLine();
		for (int i = 0; i < phonebook.length; i++) {
			boolean flag3 = false;
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(deleteNumber)) {
					phonebook[i] = null;
					System.out.println("정보가 성공적으로 삭제되었습니다.");
					flag3=true;
					break;
				}
			}
			if (flag3 = false) {
				System.out.println("잘못된 정보입니다. 다시 한 번 입력해주세요.");
			}
		}
	}

	// 5. 선택 조회하기
	public static void ChoiceAndSearch(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("기존 정보를 조회합니다.");
		System.out.println("조회하고자 하는 사용자의 이름을 입력하시오");
		String searchName = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(searchName)) {
					phonebook[i].showInfo();
					flag = true;
					break;
				}
			} else if (flag == false) {
				System.out.println("찾으시는 사용자의 정보가 존재하지 않습니다.");
				break;
			}
		}
	}

	// 0. 종료하기
	public static void END() {
		System.out.println("프로그램을 종료합니다.");
		return;
	}

} // end of class
