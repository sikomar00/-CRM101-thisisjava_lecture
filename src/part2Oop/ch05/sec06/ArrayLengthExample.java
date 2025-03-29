package part2Oop.ch05.sec06;

import java.util.Scanner;

public class ArrayLengthExample {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		int[] scores = new int[3]; //크기=3인 배열 
		
		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i]; //0 1 2
		}
		System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length; //scores.length = 3
		System.out.println("평균 : " + avg);
	}
}

