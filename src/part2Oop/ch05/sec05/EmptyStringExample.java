package part2Oop.ch05.sec05;

public class EmptyStringExample {
	public static void main(String[] args) {	
		String hobby = "";
		if("".equals(hobby)) { // | hobby.equals("")
		   System.out.println("hobby 변수가 참조는 String 객체는 빈문자열");
		}	
	}
}	
