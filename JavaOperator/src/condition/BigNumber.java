package condition;

import java.util.Scanner;
/*
 * @ Date: 2015.07.10
 * @ Author : me
 * @ Story : if-else 예제 (큰 수 구하기)
 * */
public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제)3명의 점수를 입력받아서 1등을 출력
		 결과)1등은 98점입니다. 점수는 0~100사이
		 힌트)a와b 비교후 b와c 비교 a와c 비교
		 * */
		Scanner scanner = new Scanner(System.in);
		int su1=0,su2=0,su3=0,result=0;;
		
		
		System.out.println("학생 1의 점수를 입력하세요");
		su1=scanner.nextInt();
		System.out.println("학생 2의 점수를 입력하세요");
		su2=scanner.nextInt();
		System.out.println("학생 3의 점수를 입력하세요");
		su3=scanner.nextInt();
		
		//조건식을 따져서 결과를 가정하지 말고 
		//결과를 상정한 다음 거기에 맞는 조건식을
		//설정하세요.
		if ((su1>su2)&&(su1>su3)) {
			result=su1;
		} else if((su2>su1)&&(su2>su3)){
			result=su2;
		}else if((su3>su1)&&(su3>su2)){
			result=su3;
		}
		else{
			System.out.println("동점자가 존재합니다.");
		}
	
		System.out.println("1등은"+result+"점입니다.");
	}

}
