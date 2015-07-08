package datatype;
/*
 * @ Date: 2015.07.07
 * @ Author : me
 * @ Story : 스트링 타입에 대한 문법
 * */
public class StringDemo {
	public static void main(String[] args) {
		char c = 'c'; 
		//맨 끝에 있는 ; 세미콜론은 구분자라고 부른다.
		//char 데이터타입의 c변수에 알파벳 c값을 할당함.
		System.out.println(c);
		String s = "abc";
		System.out.println(s);
		System.out.println("abc");
		//알파벳 하나만 출력할경우char타입을 사용하고 
		//하나이상 복수의 문자열을 출력할때는 String타입을 사용한다.
		//주의 할점은 싱글쿼터''와 더블쿼터""에 유의 
	}

}
