package part2Oop.ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import part2Oop.ch06.sec12.hankook.SnowTire;
import part2Oop.ch06.sec12.kumho.AllSeasonTire;

public class Car {
	//부품 필드 선언
	part2Oop.ch06.sec12.hankook.Tire tire1 = new part2Oop.ch06.sec12.hankook.Tire();
	part2Oop.ch06.sec12.kumho.Tire tire2 = new part2Oop.ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}


