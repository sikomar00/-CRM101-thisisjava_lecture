package myOriginal.part1Basic.ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) throws Exception {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
					for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower=='g') {
							break Outter;// Outer 레이블이 붙은 반복문을 탈출
						}
					}
				}
		System.out.println("프로그램 실행 종료");
	}
}
