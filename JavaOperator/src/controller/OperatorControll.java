package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorControll {
	public static void main(String[] args) {
		//2015.07.09 성적 계산기
		CalcAvg avg = new CalcAvg();
//		avg.calcAvg();
		
		//2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
//		calc.calc();
		
		//2015.07.10
		SwitchAvg avg2 = new SwitchAvg();
//		avg2.calc();
		
		//2015.07.10 2
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn(); //ssn() 원 클래스의 메소드 이름이다.
	}

}
