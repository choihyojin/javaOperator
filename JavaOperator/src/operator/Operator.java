package operator;

import java.util.Scanner;

/*
 * @ Date: 2015.07.07
 * @ Author : me
 * @ Story : 연산 코드에 관한 문법
 * */
public class Operator {
	public static void main(String[] args) {
		/*
		 연산자(opcode)는 다음과 같이 분류된다.
		 1. 단항 연산자 : ++,--,+,-
		 2. 이항 연산자 
		 	(1) 산술연산자 : 빼기-,더하기+,나누기/,곱하기*,나머지%
		 	(2) 비교연산자 : < > !=(같지않다) ==(같다)
		 	(3) 삼항연산자 : (...)? TRUE : FALSE
		 	(4) 대입(할당)연산자 : =
		 * */
		//CTRL+SHIFT+O
		Scanner scanner =new Scanner(System.in);
		System.out.println("초기값을 입력하세요");
		//스캐너로 입력한 값을 a 에 할당함
		int a = scanner.nextInt(); 
		System.out.println("연산할 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println(a+b);

		}

}