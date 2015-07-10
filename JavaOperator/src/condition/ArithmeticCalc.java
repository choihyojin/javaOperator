package condition;

import java.util.Scanner;

/*
 * @ Date: 2015.07.09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 * */
/*
 * 사칙연산 계산기
 * 덧셈,뺄셈,곱셉,나눗셈(몫:() 나머지:())
 * 사칙연산 기호도 입력받음 + ,- ,*,/
 * 출력결과
 * === 심플 계산기 ===
 * 5 X 5 = 25
 * 5 + 5 = 10
 * 6 ÷ 5 = 1 (1)
 * 5 - 6 = -1
 * */
public class ArithmeticCalc {

	public void calc(){
		Scanner scanner = new Scanner(System.in);
		
		int nmg=0,result=0;
		int su1=0,su2=0;
		String a="";
		
		System.out.println("숫자를 입력하세요");
		su1=scanner.nextInt();
		
		System.out.println("연산자를 입력하세요");
		a=scanner.next();
		
		System.out.println("숫자를 입력하세요");
		su2=scanner.nextInt();
		
		
		if (a.equals("+")){
			result=su1+su2;
		}
		else if (a.equals("-")){
			result=su1-su2;
		}
		else if (a.equals("*")){
			result=su1*su2;
		}
		else if (a.equals("/")){
			result=su1/su2;
			nmg=su1%su2;
		}
		else{
			System.out.println("연산자를 다시 입력하세요.");
		}
		System.out.println(su1+a+su2+"="+result+"("+nmg+")");

	}
}
