package part2Oop.ch05.sec05;

public class SplitTest {
	public static void main(String[] args) {
		String board = "번호,제목,내용,글쓴이";
		
		//문자열 분리
		String[] arr = board.split(","); //, 기준으로 잘라 배열에 담아라
		
		//인덱스별로 읽기
		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[1]);
		System.out.println("arr[2] " + arr[2]);
		System.out.println("arr[3] " + arr[3]);
		//System.out.println("arr[4] " + arr[4]);
		System.out.println();
		
		//for문을 이용한 읽기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr[0].charAt(0): " + arr[0].charAt(0));
	}
}
