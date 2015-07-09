package controller;

import ifCondition.ArithmeticCalc;
import ifCondition.CalcAvg;

public class OperatorControll {
	public static void main(String[] args) {
		//2015.07.09 성적 계산기
		CalcAvg avg = new CalcAvg();
//		avg.calcAvg();
		//2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
	}

}
