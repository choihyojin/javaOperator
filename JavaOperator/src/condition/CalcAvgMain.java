package condition;

import java.util.Scanner;

/*
 * @ Date: 2015.07.09
 * @ Author : me
 * @ Story : if-else 예제
 * 
 *  학생   국어  영어  수학  총점  평균  합격여부
 *  ---------------------------------------------
 *  홍길동  90    90	90	 270	90   장학생 
 *  
 *  평균이 90점 이상이면 장학생
 *  평균이 70 이상 90 미만이면 합격
 *  평균이 70미만이면 불합격
 * */
class CalcAvgMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//선언부
		String name="",msg="";
		//점수는 연산을 해야되서 int 타입으로 정해져야 한다.
		int kor=0,eng=0,math=0,total=0,avg=0;
		
		
		System.out.println("이름을 입력하세요");
		name=scanner.next();
		
		System.out.println("국어 점수를 입력하세요");
		kor=scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng=scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math=scanner.nextInt();
		
		total=kor+eng+math;
		avg=(int)total/3;//다운캐스트 소수점 이하 버림
		
		
		//연산부
		if (avg>=90) {
			msg="장학생";
		}
		else if ((avg>=70)&&(avg<90)) {
			msg="합격";
		}
		else {
			msg="불합격";
		}
		//출력부	
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("-------------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);
		
		
	}

}
