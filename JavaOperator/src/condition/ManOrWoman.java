package condition;

import java.util.Scanner;

/*
 * @ Date: 2015.07.10
 * @ Author : me
 * @ Story : switch 예제(성 판별)
 * */
public class ManOrWoman {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예800101-2123456)");
		String ssn=scanner.next();
		
		String msg="";
		/*
		 charAt(n)이 메소드는 0부터 시작하여 n번째 글자 하나만 출력하는데 
		 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		 위 예같은 상황에서는 리턴값이 2가 된다.
		 * */
		char ch = ssn.charAt(7);
		/*
		 * 1,3 남자
		 * 2,4 여자
		 * 5 외국인
		 * 잘못입력한 값입니다.
		 * */
		switch (ch) {
		case '1': case '3':
			msg="남성";
			break;
		case '2': case '4':
			msg="여성";
			break;
		case '5':
			msg="외국인";
			break;
		default:
			msg="오류";
			break;
		}
		System.out.println("입력하신 SSN은"+msg+"입니다.");
	}

}
