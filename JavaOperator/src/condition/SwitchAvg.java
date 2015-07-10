package condition;
/*
 * @ Date: 2015.07.10
 * @ Author : me
 * @ Story : switch 예제(합격여부 구하기)
 * */
import java.util.Scanner;

public class SwitchAvg {
	public void calc() {
		//선언부
		Scanner scanner = new Scanner(System.in);
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
		switch (avg/10) {
		case 10:case 9:
			msg="장학생";
			break;
		case 8:case 7:
			msg="합격";
			break;
		default:
			msg="불합격";
			break;
		}
		//출력부	
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("-------------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);
		
	}

}
